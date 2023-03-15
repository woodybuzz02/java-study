package ch06;

abstract class 공{
	abstract String getName();
}

// 상태를 직접적으로 접근하지 못하고 메소드로 접근 가능
class 농구공 extends 공{
	private String name = "농구공";

	// 자식이 부모의 메서드와 동일한 것을 들고 있으면
	// 부모의 메서드가 오버라이드(무효화)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class 축구공 extends 공{
	private String name = "축구공";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class 가방<T>{
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class GenericEx02 {
	
	static 가방<? extends 공> 꺼내기(int time) {//9시 축구 12시 농구 //와일드 카드 사용
		if (time == 9) {
			축구공 g2 = new 축구공();
			가방<축구공> b2 = new 가방<>();
			b2.setData(g2);
			return b2;
		}else {
			농구공 g1 = new 농구공();
			가방<농구공> b1 = new 가방<>();
			b1.setData(g1);
			return b1;
		}
	}

	// 제네릭 고급 = 다형성, Object, 추상클래스, 오버라이드(무효화)
	// 동적바인딩
	public static void main(String[] args) {
		
//		농구공 g1 = new 농구공();
//		축구공 g2 = new 축구공();
//		
//		가방<농구공> b1 = new 가방<>();
//		b1.setData(g1);
//		가방<축구공> b2 = new 가방<>();
//		b2.setData(g2);
//		
//		System.out.println(b1.getData().getName());
		
		가방<? extends 공> r1 = 꺼내기(9); //  와일드 카드 사용
		가방<? extends 공> r2 = 꺼내기(12);
		
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
	}

}
