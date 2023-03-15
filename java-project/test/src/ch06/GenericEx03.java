package ch06;

class 호랑이{
	String name = "호랑이";
}

class 사자{
	String name = "사자";
}

// 어떤 객체를 만들 때 타입이 정해져 있지 않으면 오브젝트로 하면 불편하니 제네릭이라는 문법을 쓰는 것
class 큰바구니<T>{
	T data;
}

public class GenericEx03 {

	public static void main(String[] args) {
		큰바구니<호랑이> s1 = new 큰바구니<>();
//		s1.data = new 호랑이();
//		
//		호랑이 h1 = (호랑이) s1.data; // 다운캐스팅 해야되서 불편
//		
//		System.out.println(h1.name);
		s1.data = new 호랑이();
		System.out.println(s1.data.name);
		
		큰바구니<사자> s2 = new 큰바구니<>();
		s2.data = new 사자();
		System.out.println(s2.data.name);
	}

}
