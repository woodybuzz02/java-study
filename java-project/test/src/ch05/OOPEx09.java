package ch05;

interface MoveAble{
	
	// public abstract�� �����Ǿ�����.
	void ��();
	void �Ʒ�();
	void ��();
	void ��();
	void �����ñ�();
}

interface MoveAble2{
	
	// public abstract�� �����Ǿ�����.
	void ��();
	void �Ʒ�();
	void ��();
	void ��();
	void ���ٴڼ���();
}

abstract class �糪��� implements MoveAble{
	abstract void ����(); // �̿ϼ��� �Լ�
	
	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ��� �̵�");
	}
	
	@Override
	public void ��() {
		System.out.println("�������� �̵�");
	}
	
	@Override
	public void ��() {
		System.out.println("���������� �̵�");
	}
	
	@Override
	public void ��() {
		System.out.println("���� �̵�");
	}
	
	// �ϼ���Ų��. �� �ڷ� ������ ���� ���̴ϱ�
	@Override
	public void �����ñ�() {
		System.out.println("�����ñ�");
		
	}
}

abstract class �¼��ѵ��� implements MoveAble2{
	abstract void ä��(); // �̿ϼ��� �Լ�
	
	@Override
	public void �Ʒ�() {
		System.out.println("�Ʒ��� �̵�");
	}
	
	@Override
	public void ��() {
		System.out.println("�������� �̵�");
	}
	
	@Override
	public void ��() {
		System.out.println("���������� �̵�");
	}
	
	@Override
	public void ��() {
		System.out.println("���� �̵�");
	}
	
	@Override
	public void ���ٴڼ���() {
		System.out.println("���ٴ����� ����");
	}
	
}

// ������ �ڽ� Ŭ������ ����(��, �Ʒ�, ��, ��)
class ������ extends �¼��ѵ���{

	@Override // ������̼� = JVM�� ����ÿ� �м��ؼ� Ȯ��= JVM�� ��Ʈ
	void ä��() {
		System.out.println("�ٳ��� ä��");
	}
	
}

class �� extends �¼��ѵ���{

	@Override
	void ä��() {
		System.out.println("Ǯ ä��");
		
	}
	
}

class �ڻԼ� extends �糪���{

	@Override
	void ����() {
		System.out.println("���� ��ġ��");
	}
	
}

class ȣ���� extends �糪���{

	@Override
	void ����() {
		System.out.println("�̻� ����");
	
	}
	
}

// ���Ծ� �� (��� �¼��ѵ���)

class �� extends �¼��ѵ��� {

	@Override
	void ä��() {
		System.out.println("������ ä��");
		
	}
	
}

public class OOPEx09 {
	
	static void ���̽�ƽ(�¼��ѵ��� u1) {
		u1.���ٴڼ���();
		u1.ä��();
		u1.��();
		u1.��();
		u1.��();
		u1.�Ʒ�();
		System.out.println("============");
	}
	
	static void ���̽�ƽ(�糪��� u1) {
		u1.����();
		u1.��();
		u1.��();
		u1.��();
		u1.�Ʒ�();
		u1.�����ñ�();
		System.out.println("============");
	}
	
	public static void main(String[] args) {
		������ u1 = new ������();
		
		���̽�ƽ(u1);
		
		�� u2 = new ��();
		
		���̽�ƽ(u2);
		
		�ڻԼ� u3 = new �ڻԼ�();
		
		���̽�ƽ(u3);
		
		ȣ���� u4 = new ȣ����();
		
		���̽�ƽ(u4);
		
		�� u5 = new ��();
		
		���̽�ƽ(u5);
	}

}
