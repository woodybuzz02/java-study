package ch05;

interface RemoconAble {
	public void �ʷϹ�ư();
	public void ������ư();
}

class Samsung implements RemoconAble{

	@Override
	public void �ʷϹ�ư() {
		System.out.println("��������");
		
	}

	@Override
	public void ������ư() {
		System.out.println("��������");
		
	}
	
}

class LG implements RemoconAble{

	@Override
	public void �ʷϹ�ư() {
		System.out.println("��������");
		
	}

	@Override
	public void ������ư() {
		System.out.println("��������");
		
	}
	
}


public class ExampleEx01 {
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		Samsung s2 = new Samsung();
		s1.������ư();
		s1.�ʷϹ�ư();
		s2.������ư();
		s2.�ʷϹ�ư();
		LG l1 = new LG();
		LG l2 = new LG();
		l1.������ư();
		l1.�ʷϹ�ư();
		l2.������ư();
		l2.�ʷϹ�ư();
	}
}
