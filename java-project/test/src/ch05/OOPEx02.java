package ch05;

class Engine {
	int power = 2000;
}

class Car { // 자동차는 엔진이 아니기 때문에 상속할 수 없다.
	// 잘 만들어진 것을 가져와서 쓰는 것
	// 컴포지션(결합)
	Engine e;
	public Car(Engine e) {
		this.e = e;
	}
}

class Hamburger{
	String name = "기본햄버거";
	String 재료1 = "양상추";
	String 재료2 = "패티";
}

// 상속은 상태와 행위를 물려받을 수 있지만 꼭 타입이 일치될 수 있어야 한다.
class CheeseHamburger extends Hamburger { // 치즈햄버거 = 햄버거
	// 겹치지 않는 상태(필드)만 물려받는다.
	String name = "치즈햄버거";
}

// 꼭 상속하지않아도 다른 클래스가 만든 것을 재사용해서 쓸 수 있다. -> 컴포지션(결합)
class ChickenHamburger{
	String name = "치킨햄버거";
	Hamburger h;
	public ChickenHamburger(Hamburger h) {
		this.h = h;
	}
}

public class OOPEx02 {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car c1 = new Car(e1);
		System.out.println("자동차의 엔진 마력은 "+c1.e.power);
		CheeseHamburger ch1 = new CheeseHamburger();
		System.out.println("햄버거 이름 : "+ch1.name);
		System.out.println("재료 : "+ch1.재료1);
		System.out.println("재료 : "+ch1.재료2);
		
		Hamburger h1 = new Hamburger();
		ChickenHamburger ckh1 = new ChickenHamburger(h1);
		System.out.println(ckh1.name);
		System.out.println(ckh1.h.재료1);
		System.out.println(ckh1.h.재료2);
		System.out.println(ckh1.h.name);
	}

}
