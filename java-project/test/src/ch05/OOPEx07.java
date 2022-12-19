package ch05;

// 추상클래스
abstract class Animal {
//	void speak() {} <- 어차피 안쓰는 거
	abstract void speak(); // 이렇게 만든다. 추상메서드(몸체{}가 없다.)
	
	void Hello() { // 몸체가 있는 어떤 메서드도 만들 수 있다.
		System.out.println("!!!");
	}
}

class Dog extends Animal{
	
	// 오버라이드(Animal의 speak()가 무효화된다.)
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	
	// 오버라이드(Animal의 speak()가 무효화된다.)
	void speak() {
		System.out.println("야옹");
	}
}

// 신입아 Bird를 만들어!!, Animal을 상속해서 만들어! // sysout 짹짹!!
class Bird extends Animal{

	// 추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다.
	@Override
	void speak() {
		System.out.println("짹짹");
		
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		
		a1.speak(); // 동적바인딩 된다. 왜? 부모의 메서드가 무효화되니까!!
		a2.speak();
		a3.speak();
		
		//Animal a3 = new Animal(); // 추상클래스라서 안됨
	}

}
