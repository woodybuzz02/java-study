package ch03;

public class CoinExample {

	public static void main(String[] args) {
		// 동전구하기 500, 100, 50, 10
		int money = 3680;
		int restMoney = money;
		
		// 변수명 첫글자는 숫자가 될 수 없다.
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		
		count500 = restMoney/500;
		System.out.println("500원 : "+count500);
		restMoney = money%500;
		System.out.println("남은 금액 : "+restMoney);
		
		count100 = restMoney/100;
		System.out.println("100원 : "+count100);
		restMoney = restMoney%100;
		System.out.println("남은 금액 : "+restMoney);
		
		count50 = restMoney/50;
		System.out.println("50원 : "+count50);
		restMoney = restMoney%50;
		System.out.println("남은 금액 : "+restMoney);
		
		count10 = restMoney/10;
		System.out.println("10원 : "+count10);
		restMoney = restMoney%10;
		System.out.println("남은 금액 : "+restMoney);
		
		System.out.println(money+"의 최소 동전개수는?");
		System.out.println("500원 "+count500+"개");
		System.out.println("100원 "+count100+"개");
		System.out.println("50원 "+count50+"개");
		System.out.println("10원 "+count10+"개");
	}

}
