package ch06;

public class ConEx03 {

	public static void main(String[] args) {
		int point = 70;
		
		// 90���� ������ ���� �ְڴ�.
		// 80���� ������ �����Ÿ� ���ְڴ�.
		// �װ� �ƴϸ� �鸸���� �ݳ��ض�.
		
		if(point>90) { // 1. ���� 90���� �Ѵ´ٸ�?
			System.out.println("�뵷��");
		}else if(point>80){ // 2. 90���� ���� ���ϰ� 80���� �Ѵ´ٸ�
			System.out.println("��������");
		}else { // 3. �� �� ������ �������� ������ ��
			System.out.println("�鸸���ݳ�");
		};

	}

}
