package ch06;

class ȣ����{
	String name = "ȣ����";
}

class ����{
	String name = "����";
}

// � ��ü�� ���� �� Ÿ���� ������ ���� ������ ������Ʈ�� �ϸ� �����ϴ� ���׸��̶�� ������ ���� ��
class ū�ٱ���<T>{
	T data;
}

public class GenericEx03 {

	public static void main(String[] args) {
		ū�ٱ���<ȣ����> s1 = new ū�ٱ���<>();
//		s1.data = new ȣ����();
//		
//		ȣ���� h1 = (ȣ����) s1.data; // �ٿ�ĳ���� �ؾߵǼ� ����
//		
//		System.out.println(h1.name);
		s1.data = new ȣ����();
		System.out.println(s1.data.name);
		
		ū�ٱ���<����> s2 = new ū�ٱ���<>();
		s2.data = new ����();
		System.out.println(s2.data.name);
	}

}
