package ch03;

public class OperEx04 {

	public static void main(String[] args) {
		System.out.println(1 == 1 && 1==2); // true and false -> false
		System.out.println(1 == 1 || 1==2);	 // true or false -> true, 둘중 하나만 true라면 true
		
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1==n1 || n1==n2);
		
		// 상수 = 변하지않는 수(1)
		// 변수 = 변하는 수(n1)
	}

}
