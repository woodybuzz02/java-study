package ch04;

// this�� �ڱ��ڽ��� �������� ����Ų��.
public class People {
	String name;
	int age;
	
	public People() {

	}
	// ����Ʈ �����ڰ� �������? ���� -> .java -> .class �������� �� �ڹٰ� �ڵ����� �ڵ带 �������
	public People(String name, int age) {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		this.name = name;
		this.age = age;
	}
	
}
