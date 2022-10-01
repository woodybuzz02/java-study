package ch04;

public class Food {
	String name;
	int price;
	
	public Food(String name, int price) {
		this.name =name;
		this.price = price;
	}
		
	void myPrint() {
		System.out.println(name+" 가격은 "+price+"원 입니다.");
	}
}
