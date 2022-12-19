package ch05;

// 요리사
class 요리사 {
	String name = "요리사";
}

// 홍길동 or 요리사
class 홍길동 extends 요리사{
	String name = "홍길동";
}

public class OOPEx03 {

	public static void main(String[] args) {
		홍길동 h1 = new 홍길동(); // 힙공간에 홍길동과 요리사가 같이 떠있음.
		System.out.println(h1.name);
		
		요리사 y1 = new 홍길동(); // 이것이 가능한 이유는 힙공간에 홍길동과 요리사가 같이 떠있는데 바라보는 것을 요리사로 한 것이기 때문이다.
		System.out.println(y1.name);
		
		// 홍길동 h2 = new 요리사(); // 메모리에 뜬 것은 요리사만 떴기때문에 홍길동을 바라볼수가 없어서 오류가 난다.
	}

}
