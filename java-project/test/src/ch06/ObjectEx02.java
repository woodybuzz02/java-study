package ch06;

class �ü�{
	String name = "�ü�";
}

class ���� {
	String name = "����";
}

public class ObjectEx02 {

	public static void main(String[] args) {
		
//		�ü�[] s1 = new �ü�[2];
//		s1[0] = new �ü�();
//		s1[1] = new �ü�();
		
		// �ü��� ���縦 ���� �����ϰ� �ʹ�.
		// � Ÿ�Ե��� ��� ����� �� �����ϰ� �� �� �ִ�.
		
		Object[] s1 = new Object[2];
		s1[0] = new �ü�();
		s1[1] = new ����();
		
		// ���� - �ٿ�ĳ����
		
		�ü� g1 = (�ü�)s1[0];
		���� g2 = (����)s1[1];
		
		System.out.println(g1.name);
		System.out.println(g2.name);
	}

}
