package ch06;

abstract class ��{
	abstract String getName();
}

// ���¸� ���������� �������� ���ϰ� �޼ҵ�� ���� ����
class �󱸰� extends ��{
	private String name = "�󱸰�";

	// �ڽ��� �θ��� �޼���� ������ ���� ��� ������
	// �θ��� �޼��尡 �������̵�(��ȿȭ)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class �౸�� extends ��{
	private String name = "�౸��";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class ����<T>{
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class GenericEx02 {
	
	static ����<? extends ��> ������(int time) {//9�� �౸ 12�� �� //���ϵ� ī�� ���
		if (time == 9) {
			�౸�� g2 = new �౸��();
			����<�౸��> b2 = new ����<>();
			b2.setData(g2);
			return b2;
		}else {
			�󱸰� g1 = new �󱸰�();
			����<�󱸰�> b1 = new ����<>();
			b1.setData(g1);
			return b1;
		}
	}

	// ���׸� ��� = ������, Object, �߻�Ŭ����, �������̵�(��ȿȭ)
	// �������ε�
	public static void main(String[] args) {
		
//		�󱸰� g1 = new �󱸰�();
//		�౸�� g2 = new �౸��();
//		
//		����<�󱸰�> b1 = new ����<>();
//		b1.setData(g1);
//		����<�౸��> b2 = new ����<>();
//		b2.setData(g2);
//		
//		System.out.println(b1.getData().getName());
		
		����<? extends ��> r1 = ������(9); //  ���ϵ� ī�� ���
		����<? extends ��> r2 = ������(12);
		
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
	}

}
