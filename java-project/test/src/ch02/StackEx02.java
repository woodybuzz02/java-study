package ch02;

/*
 * ���� : Stack(��������=�޼��尡 ����� �� �޸𸮿� �Ҵ�ȴ�=�޼��尡 ����� �� �޸𸮿��� �������)
 * 	        Heap(��������=new�� �� �޸𸮿� �Ҵ�ȴ�=���̻� �������� ���� �� �޸𸮿��� �ڵ����� �������)
 *         Static(��������=main�޼��尡 ����Ǳ� ���� �޸𸮿� �Ҵ�ȴ�=main�޼��尡 ����Ǹ� �޸𸮿��� �������)
 */

public class StackEx02 {
	
	static int sum = 20; // ��������(static) main�޼��尡 �Ҵ�Ǳ� ���� sum�� �Ҵ�ȴ�.
	int value = 50; // ��������(heap) // ���̻� �������� ���� �� �ڵ����� �������.
	
	static void a() {
		// a�޼��尡 ����� �� stack������ n1�� �Ҵ�ǰ� a�޼��尡 ����Ǹ� �޸𸮿� �������.
		int n1 = 1; // a�޼����� ���ÿ����� �����(��������)(stack)
		System.out.println(n1);
		
		// 24�� ������ ����Ƿ��� �� �� static������ �Ҵ�Ǿ���ϴµ� �Ұ����ϴ�. static���� �Ҵ��� main�޼��� ���������� �����ϴ�.
		// static int n2 = 2; - ����
	}

	public static void main(String[] args) {
		a(); // �޼��带 ȣ���Ѵ�.
		// System.out.println(n1);
		StackEx02 s = new StackEx02(); // new�� �ϸ� static�� �ƴ� ��� �͵��� �ε�ȴ�.
		// 17�� ���ο��� heap������ value�� �Ҵ�ȴ�.
		System.out.println(s.value);
		System.out.println("test1 - ���̻� s ������ �������� �ʱ⶧���� �޸𸮿��� �ڵ����� �������.");
	}

}