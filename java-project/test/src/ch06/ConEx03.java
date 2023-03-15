package ch06;

public class ConEx03 {

	public static void main(String[] args) {
		int point = 70;
		
		// 90점이 넘으면 차를 주겠다.
		// 80점이 넘으면 자전거를 사주겠다.
		// 그게 아니면 백만원을 반납해라.
		
		if(point>90) { // 1. 만약 90점을 넘는다면?
			System.out.println("용돈줌");
		}else if(point>80){ // 2. 90점을 넘지 못하고 80점을 넘는다면
			System.out.println("자전거줌");
		}else { // 3. 위 두 조건을 만족하지 못했을 때
			System.out.println("백만원반납");
		};

	}

}
