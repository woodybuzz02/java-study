package ch05.srpdip;

interface talkAble{
	// public abstract�� �����Ǿ�����.
	void talk();
}

abstract class Ȧ���� implements talkAble{
	abstract void û��();
	
	@Override
	public void talk() {
		System.out.println("�մ԰� ��ȭ");	
	}
}

abstract class ������ extends Ȧ����{
	void �����ϱ�() {
		System.out.println("�����ϱ�");
	}
//	void �ֹ��ޱ�() {
//		System.out.println("�ֹ��ޱ�");
//	}
// ���� �ֹ��� Ű����ũ�� �ޱ⶧���� �ֹ��ޱⰡ �ʿ��������.
}

abstract class ĳ�� extends Ȧ����{
//	void �����ϱ�() {
//		System.out.println("�����ϱ�");
//	}
	void �����ϱ�() {
		System.out.println("���� �����ϱ�");
	}
//	void ����ϱ�() {
//		System.out.println("����ϱ�");
//	}
	void ����ϱ�() {
		System.out.println("ī�� ����ϱ�");
	}
}

abstract class �丮�� {
	abstract void �丮�ϱ�();
}

class ȫ�浿 extends ������{
	
	�丮�� j; // ������ ���� ��Ģ

	@Override
	void û��() {
		System.out.println("ȭ���û��");		
	}
	
}

class �Ӳ��� extends ������{
	
	�丮�� j; // ������ ���� ��Ģ

	@Override
	void û��() {
		System.out.println("�ֹ�û��");		
	}
	
}

class ������ extends ĳ��{

	@Override
	void û��() {
		System.out.println("Ȧû��");	
	}
	
}

class �̸��� extends ĳ��{

	@Override
	void û��() {
		System.out.println("���̺�û��");		
	}
	
}

//class �庸�� extends �丮��{
//
//	@Override
//	void �丮�ϱ�() {
//		System.out.println("��� �����");		
//	}
//	
//}
// �̷��� �ص� �ڵ� ������ �����ʴ´�. �ֳ��ϸ� �庸�� ������ ���� �ƴ� �丮�翡 ������ �� ���̱⶧���̴�.

class ������ extends �丮��{

	@Override
	void �丮�ϱ�() {
		System.out.println("��� �����");		
	}
	
}

class �̼��� extends �丮��{

	@Override
	void �丮�ϱ�() {
		System.out.println("�ѽ� �����");		
	}
	
}

public class OOPEx10 {
	

}
