package ch04;

// ���� �ʱ�ȭ���� �ʴ� ������ new �� ������ �ٸ� ���¸� ���� ����̸� �����ϱ� ���ؼ� �̴�.
public class Cat {
	String name; // �ʱ�ȭ�����ʾҴ�.
	String color; // ������
	
	// Cat() �����ڸ� ����Ʈ(�⺻) �����ڶ�� �Ѵ�. (�Ű������� ���� ��)
	// �����ڰ� ���� �ʾƵ� �ִ� ��!!(���������� �ڵ�)
	public Cat() {
		
	}
	
	// �����ڰ� ���� ������ ������ = ����Ʈ �����ڰ� ������ ����
	public Cat(String n, String c) { // ������(�޼���)
		System.out.println("�����ź��");
		System.out.println("n : "+ n);
		System.out.println("c : "+ c);
		
		// String n, String c �� �������� = Cat() �̶�� ������(�޼���)�� ���� ��������, ���ð���
		name = n;
		color = c;
	}
	
//	String name = "����"; // Ŭ�������� ���¸� ������ �� ���� �ʱ�ȭ�����ʴ´�.
//	String color = "�Ͼ��";
}
