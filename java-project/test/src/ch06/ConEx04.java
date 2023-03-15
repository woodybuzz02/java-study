package ch06;

public class ConEx04 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 수를 출력하세요! (단, 숫자가 6일 때는 출력하지 마세요.)
		for(int i = 1; i<11; i++) {
			if(i != 6) {
				System.out.println(i);
			}
		}
		// 10 ~ 1까지의 수를 출력하세요! (단, 숫자가 3일 때는 출력하지 마세요.)
		for(int i = 10; i>0; i--) {
			if(i != 3) {
				System.out.println(i);
			}
		}
		// 1 ~ 20까지의 수를 출력하세요! (단, 2의 배수일 때만 출력하세요.)
		for(int i = 1; i<21; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}

}
