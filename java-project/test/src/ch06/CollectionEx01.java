package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		//�⺻�ڷ����� ���� ������ ������ ���۷����ڷ����� �ּҸ� �������ִ�.
		//���׸��� �⺻�ڷ����� �ȵ���.
		//����Ŭ���� = Integer,Double,Character,Boolean �⺻�ڷ����� ���۷����ڷ���ó�� ������ִ� Ŭ�����̴�.
		ArrayList<Integer> c1 = new ArrayList<>();
		
		c1.add(1);
		c1.add(2);
		
		System.out.println(c1.get(0));
		
//		for (int i = 0; i < c1.size(); i++) {
//			System.out.println(c1.get(i));
//		}
		// �޼��带 ��� ȣ���ϴ� ���� ������.
		
		int size = c1.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
