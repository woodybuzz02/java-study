package ch01;

class FishShapedBun {
	int price = 1000;
//	char taste = 's';
//	char color = 'y';	
	String taste = "������";
	String color = "yellow";
}

public class Excercise {
	
//	class FishShapedBun {
//		int price = 1000;
////		char taste = 's';
////		char color = 'y';	
//		String taste = "������";
//		String color = "yellow";
//	}
	// static�Լ���  FishShapedBun�� �����ϴµ� FishShapedBun�� ���������ʾұ⶧���� ������ ������.
	// ���� Ŭ������ ���Ե� ���� Ŭ������ �̸� �����ϰ� ���� ����� �����ϴ�.
	// ���� Ŭ������ static�� �ٿ� �̸� ������ �ΰų� ���԰��踦 ����� Ŭ������ ������ ������ �ȴ�.
	// �ΰ��� Ŭ���� ������ ���� �ȴ�.
	
	public static void main(String[] args) {
		FishShapedBun fishShapedBun1 = new FishShapedBun();
		System.out.println(fishShapedBun1.price);
		System.out.println(fishShapedBun1.taste);
		System.out.println(fishShapedBun1.color);

	}

}
;
