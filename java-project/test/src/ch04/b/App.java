package ch04.b;

import ch04.a.Cal;

// main�� �ִ� �ڹ������� ���������̶�� �Ѵ�.
public class App {

	// JVM�� main�޼��带 ã������ public�� �ʿ��ϴ�.(����)
	// JVM�� main�޼��带 ã������ static�� �ʿ��ϴ�.(�޸𸮿� �ø���.)
	// main�޼��常 return Ÿ���� ��������ʴ´�.
	// �޼����� �̸��� main�̴�.
	
	public static void main(String[] args) {
		Cal c = new Cal(); // new �����ڸ� �̿��� �������� �ø���.
		c.minus();
		// System.out.println(c.num); ����Ʈ �����������̱⶧���� ã��������.
	}

}
