package ch02;

public class MethodEx02 {
	
	// void�� ����(��������)���� �ʰڴٴ� ��
	static int add() { // ȣ��Ǹ� �߰�ȣ ���ΰ� ����ȴ�. �̶� Stack ������ �޸𸮿� ���������.
		int sum = 5+6;
		// System.out.println(sum); // ȭ�鿡 ���
		return sum;
	}
	
	public static void main(String[] args) {
		int result = add(); // add() �޼��� ȣ��
		System.out.println(result);
	}

}
