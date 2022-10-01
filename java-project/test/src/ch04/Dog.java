package ch04;

// 클래스 = 여러가지 특징(상태)을 가지고 있다.
// int -> 한가지의 상태만 가질 수 있다.
// String -> 한가지의 상태만 가질 수 있다.
public class Dog {
	int age = 20; // 변경가능
	String name = "복실이"; // 변경가능
	String color = "하얀색"; // 변경가능
	final String type = "말티즈"; // 변경불가능(상수)
}

// 변수, 필드, 전역변수(지역변수가 아니다, 메서드 내부에서 만들어진 것이 아니다.), 힙변수, 상태
