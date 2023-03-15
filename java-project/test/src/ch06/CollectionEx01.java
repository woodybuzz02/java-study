package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		//기본자료형은 값을 가지고 있지만 레퍼런스자료형은 주소를 가지고있다.
		//제네릭은 기본자료형이 안들어간다.
		//래핑클래스 = Integer,Double,Character,Boolean 기본자료형을 레퍼런스자료형처럼 만들어주는 클래스이다.
		ArrayList<Integer> c1 = new ArrayList<>();
		
		c1.add(1);
		c1.add(2);
		
		System.out.println(c1.get(0));
		
//		for (int i = 0; i < c1.size(); i++) {
//			System.out.println(c1.get(i));
//		}
		// 메서드를 계속 호출하는 것은 안좋음.
		
		int size = c1.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
