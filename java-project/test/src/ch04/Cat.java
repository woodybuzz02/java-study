package ch04;

// 값을 초기화하지 않는 이유는 new 할 때마다 다른 상태를 가진 고양이를 생성하기 위해서 이다.
public class Cat {
	String name; // 초기화하지않았다.
	String color; // 힙공간
	
	// Cat() 생성자를 디폴트(기본) 생성자라고 한다. (매개변수가 없는 것)
	// 개발자가 적지 않아도 있는 것!!(생략가능한 코드)
	public Cat() {
		
	}
	
	// 개발자가 직접 생성자 구현함 = 디폴트 생성자가 생기지 않음
	public Cat(String n, String c) { // 생성자(메서드)
		System.out.println("고양이탄생");
		System.out.println("n : "+ n);
		System.out.println("c : "+ c);
		
		// String n, String c 는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수, 스택공간
		name = n;
		color = c;
	}
	
//	String name = "집사"; // 클래스만들어서 상태를 정의할 때 값을 초기화하지않는다.
//	String color = "하얀색";
}
