package ch06;

public class ArrayForEx01 {
	
	static void �����ݾװ��(int[] coin, int restMoney) {
		for(int i = 0; i<coin.length; i++) {
			System.out.println(coin[i]+"�� : "+(restMoney/coin[i]));
			restMoney = restMoney%coin[i];
			System.out.println("���� �ݾ� : "+restMoney);
		}
	}
	
	public static void main(String[] args) {
		// �������ϱ� 500, 100, 50, 10
				int coin[] = {500,100,50,10};
				int money = 1350;
				int restMoney = money;
				
				�����ݾװ��(coin,restMoney);
	}
}
