package ch06;

public class ConEx02 {

	public static void main(String[] args) {
		int point = 80;
		
		// 아버지 성적인  90점이 넘으면 용돈을 주겠다.
		// 만약 안넘으면 삼만원을 반납해라.
		if(point>90) {
			System.out.println("용돈줌");
		}else {
			System.out.println("삼만원 반납해라");
		}

	}

}
