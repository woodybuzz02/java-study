package ch05;

interface RemoconAble {
	public void 초록버튼();
	public void 빨간버튼();
}

class Samsung implements RemoconAble{

	@Override
	public void 초록버튼() {
		System.out.println("전원켜짐");
		
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원꺼짐");
		
	}
	
}

class LG implements RemoconAble{

	@Override
	public void 초록버튼() {
		System.out.println("전원켜짐");
		
	}

	@Override
	public void 빨간버튼() {
		System.out.println("전원꺼짐");
		
	}
	
}


public class ExampleEx01 {
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		Samsung s2 = new Samsung();
		s1.빨간버튼();
		s1.초록버튼();
		s2.빨간버튼();
		s2.초록버튼();
		LG l1 = new LG();
		LG l2 = new LG();
		l1.빨간버튼();
		l1.초록버튼();
		l2.빨간버튼();
		l2.초록버튼();
	}
}
