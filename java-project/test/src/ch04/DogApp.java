package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // heap������ ����.
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.name);
		System.out.println(d1.type);
		
		// 1���� ������. �������� ������ �ߴ�. �̸��� �ٲ��.
		d1.age = d1.age +1;
		d1.name = "ȭ��Ʈ";
		d1.color = "�����";
		// d1.type = "Ǫ��"; final�� �ٿ��� ����� �Ǿ���.
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.name);
		System.out.println(d1.type);
		
	}

}
