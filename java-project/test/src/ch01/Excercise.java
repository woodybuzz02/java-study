package ch01;

class FishShapedBun {
	int price = 1000;
//	char taste = 's';
//	char color = 'y';	
	String taste = "달콤함";
	String color = "yellow";
}

public class Excercise {
	
//	class FishShapedBun {
//		int price = 1000;
////		char taste = 's';
////		char color = 'y';	
//		String taste = "달콤함";
//		String color = "yellow";
//	}
	// static함수가  FishShapedBun을 참조하는데 FishShapedBun이 생성되지않았기때문에 오류가 생간다.
	// 상위 클래스에 포함된 하위 클래스는 미리 생성하고 나서 사용이 가능하다.
	// 하위 클래스에 static을 붙여 미리 생성해 두거나 포함관계를 벗어나서 클래스를 밖으로 꺼내면 된다.
	// 두개의 클래스 파일을 만들어도 된다.
	
	public static void main(String[] args) {
		FishShapedBun fishShapedBun1 = new FishShapedBun();
		System.out.println(fishShapedBun1.price);
		System.out.println(fishShapedBun1.taste);
		System.out.println(fishShapedBun1.color);

	}

}
;
