package ch05;

// ���������� = ����Ʈ ����������, public ����������, private ����������
class Player {
	// ���� = �ʵ�
	// ���� �ʱ�ȭ�������� ������ new�� ������ �ٸ� ���¸� ���� player�� �����ϱ� ���ؼ��̴�.
	String name;
	private int thirsty; // �ܺ� Ŭ�������� ���� �Ұ���
	
	// �����ڴ� Ŭ������� ���� �̸��� ���� �޼���
	// new �����ڿ� ���� ���Ǿ� Ŭ�����κ��� ��ü�� ������ �� ��ü�� ��Űȭ�� ���� ���
	// Ŭ���� ���ο� ������ ������ �����ϸ� �����Ϸ��� Ŭ���� ���ο� �⺻������(default constructor)�� ����Ʈ �ڵ忡 �ڵ����� �߰�
	// �Ű������� ���� ������ �����ڸ� ������ٸ� �⺻ �����ڸ� �ʼ������� �������Ѵ�.
	// this�� �ڱ��ڽ��� ������
	public Player(String name, int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
		// �������� ���� String name, int thirsty�� heap�� �ֱ�
	}
	// ���� = �޼��� = ���� ����
	void �����ñ�() {
		System.out.println("�����ñ� ����");
		this.thirsty = this.thirsty - 50;
	}
	
	int �񸶸�����Ȯ��() {
		return this.thirsty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("ȫ�浿", 100);
		System.out.println("�̸��� "+p1.name);
		System.out.println("���������� "+p1.�񸶸�����Ȯ��()); // thirsty��� ������ ã�� �� ����.
		
		// 1. ù��° �ó����� = ���� (x)
		// p1.thirsty = 50; // ������ ���� �������� ���� = ����
		// System.out.println("���������� "+p1.thirsty);
		
		// 2. �ι�° �ó����� = ���°� ������ ������ (x) - �Ǽ��� �� ����
		// p1.�����ñ�();
		// p1.thirsty = 50; // int thirsty;�� �Ǿ��־ �������� ����(=�ʵ�)�� ���� ������ �� �ִ�. ����Ʈ ���������ڴ� ��Ű�����ο��� ������ �� �ִ�.
		// System.out.println("���������� "+p1.thirsty);
		
		// 3. ����° �ó�����
		p1.�����ñ�(); // �Ǽ��� �� ����. private int thirsty;�� �ٲٸ� �ܺ� Ŭ�������� ���� �Ұ���.
		// p1.thirsty�� ������ �� ���⶧���� �񸶸�����Ȯ��()�� ����.
		System.out.println("���������� "+p1.�񸶸�����Ȯ��());
	}

}
