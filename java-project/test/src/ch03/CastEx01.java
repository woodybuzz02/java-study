package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// ĳ����(�ٿ�ĳ����, ��ĳ����)
		int n1 = 100; // 4Byte
		double d1 = n1; // 8Byte (8Byte <- 4Byte)
		System.out.println(d1); // ��ĳ����(������)
		
		double d2 = 100.8;
		// ������ ����ȯ (int) �ٿ� ĳ����
		int n2 = (int)d2; // double�� int�� ��ȯ�� �� ����.
		System.out.println(n2); // ���� : �����Ͱ� ���ǵ� �� �ִ�.
		
		int money = 130;
		System.out.println(130/100);
		System.out.println(money/100);
		System.out.println(money/100.0); // int/double => double
	}

}