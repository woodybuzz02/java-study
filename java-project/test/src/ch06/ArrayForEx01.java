package ch06;

public class ArrayForEx01 {
	
	static void 남은금액계산(int[] coin, int restMoney) {
		for(int i = 0; i<coin.length; i++) {
			System.out.println(coin[i]+"원 : "+(restMoney/coin[i]));
			restMoney = restMoney%coin[i];
			System.out.println("남은 금액 : "+restMoney);
		}
	}
	
	public static void main(String[] args) {
		// 동전구하기 500, 100, 50, 10
				int coin[] = {500,100,50,10};
				int money = 1350;
				int restMoney = money;
				
				남은금액계산(coin,restMoney);
	}
}
