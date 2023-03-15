package ch06;

class 궁수{
	String name = "궁수";
}

class 전사 {
	String name = "전사";
}

public class ObjectEx02 {

	public static void main(String[] args) {
		
//		궁수[] s1 = new 궁수[2];
//		s1[0] = new 궁수();
//		s1[1] = new 궁수();
		
		// 궁수와 전사를 같이 저장하고 싶다.
		// 어떤 타입들을 묶어서 사용할 때 유용하게 쓸 수 있다.
		
		Object[] s1 = new Object[2];
		s1[0] = new 궁수();
		s1[1] = new 전사();
		
		// 단점 - 다운캐스팅
		
		궁수 g1 = (궁수)s1[0];
		전사 g2 = (전사)s1[1];
		
		System.out.println(g1.name);
		System.out.println(g2.name);
	}

}
