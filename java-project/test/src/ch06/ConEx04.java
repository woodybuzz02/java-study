package ch06;

public class ConEx04 {

	public static void main(String[] args) {
		// 1 ~ 10������ ���� ����ϼ���! (��, ���ڰ� 6�� ���� ������� ������.)
		for(int i = 1; i<11; i++) {
			if(i != 6) {
				System.out.println(i);
			}
		}
		// 10 ~ 1������ ���� ����ϼ���! (��, ���ڰ� 3�� ���� ������� ������.)
		for(int i = 10; i>0; i--) {
			if(i != 3) {
				System.out.println(i);
			}
		}
		// 1 ~ 20������ ���� ����ϼ���! (��, 2�� ����� ���� ����ϼ���.)
		for(int i = 1; i<21; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
