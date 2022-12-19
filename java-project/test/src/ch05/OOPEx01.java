package ch05;

// 접근제어자 = 디폴트 접근제어자, public 접근제어자, private 접근제어자
class Player {
	// 상태 = 필드
	// 값을 초기화하지않은 이유는 new할 때마다 다른 상태를 가진 player를 생성하기 위해서이다.
	String name;
	private int thirsty; // 외부 클래스에서 접근 불가능
	
	// 생성자는 클래스명과 같은 이름을 가진 메서드
	// new 연산자와 같이 사용되어 클래스로부터 객체를 생성할 때 객체의 초키화를 위해 사용
	// 클래스 내부에 생성자 선언을 생략하면 컴파일러가 클래스 내부에 기본생성자(default constructor)를 바이트 코드에 자동으로 추가
	// 매개변수를 갖는 임의의 생성자를 만들었다면 기본 생성자를 필수적으로 만들어야한다.
	// this는 자기자신의 힙공간
	public Player(String name, int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
		// 스택으로 받은 String name, int thirsty을 heap에 넣기
	}
	// 행위 = 메서드 = 값을 변경
	void 물마시기() {
		System.out.println("물마시기 행위");
		this.thirsty = this.thirsty - 50;
	}
	
	int 목마름상태확인() {
		return this.thirsty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름은 "+p1.name);
		System.out.println("갈증지수는 "+p1.목마름상태확인()); // thirsty라는 변수를 찾을 수 없다.
		
		// 1. 첫번째 시나리오 = 마법 (x)
		// p1.thirsty = 50; // 원인이 없이 갈증지수 변경 = 마법
		// System.out.println("갈증지수는 "+p1.thirsty);
		
		// 2. 두번째 시나리오 = 상태가 행위를 변경함 (x) - 실수할 수 있음
		// p1.물마시기();
		// p1.thirsty = 50; // int thirsty;로 되어있어서 누군가는 상태(=필드)를 직접 변경할 수 있다. 디폴트 접근제어자는 패키지내부에서 접근할 수 있다.
		// System.out.println("갈증지수는 "+p1.thirsty);
		
		// 3. 세번째 시나리오
		p1.물마시기(); // 실수할 수 없음. private int thirsty;로 바꾸면 외부 클래스에서 접근 불가능.
		// p1.thirsty는 접근할 수 없기때문에 목마름상태확인()을 생성.
		System.out.println("갈증지수는 "+p1.목마름상태확인());
	}

}
