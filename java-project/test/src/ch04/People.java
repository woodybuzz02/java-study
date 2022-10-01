package ch04;

// this는 자기자신의 힙공간을 가리킨다.
public class People {
	String name;
	int age;
	
	public People() {

	}
	// 디폴트 생성자가 있을까요? 있음 -> .java -> .class 컴파일할 때 자바가 자동으로 코드를 만들어줌
	public People(String name, int age) {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		this.name = name;
		this.age = age;
	}
	
}
