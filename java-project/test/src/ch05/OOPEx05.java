package ch05;

class ���� { // ��
	String name = "����";
	
	void �⺻����(�ü� e1) {
		System.out.println("������ "+e1.name+" �����ϱ�");
	}
	
	// �����ε� (������ 100�����)
	void �⺻����(������ e1) {
		System.out.println("������ "+e1.name+" �����ϱ�");
	}
	
	// �����ε� (������ 100�����)
	void �⺻����(������ e1) {
		System.out.println("������ "+e1.name+" �����ϱ�");
	}
	
	// �����ε� (������ 100�����)
	void �⺻����(�渶���� e1) {
		System.out.println("������ "+e1.name+" �����ϱ�");
	}
	
	// ������ 100����� �⺻���� �޼��尡 100���� �Ǿ�� �Ѵ�. ��û�� ����!
	// �����ε��� ��� ������ ����� ���� ������ �Ǿ��ִٸ� ����.
	// ������ ����� ���� ���ٸ� �����.
}

class �ü� { // Ȱ
	String name = "�ü�";
	
	void �⺻����(������ e1) {
		System.out.println("Ȱ�� "+e1.name+" �����ϱ�");
	}
}

class ������ { // ����
	String name = "������";
	
	void �⺻����(���� e1) {
		System.out.println("������ "+e1.name+" �����ϱ�");
	}
}

class ������ { // ����
	String name = "������";
	
	void �⺻����(���� e1) {
		System.out.println("�������� "+e1.name+" �����ϱ�");
	}
}

class �渶���� { // �渶��
	String name = "�渶����";
	
	void �⺻����(���� e1) {
		System.out.println("�渶������ "+e1.name+" �����ϱ�");
	}
}

public class OOPEx05 {

	public static void main(String[] args) {
		���� u1 = new ����();
		�ü� u2 = new �ü�();
		������ u3 = new ������();
		������ u4 =  new ������();
		�渶���� u5 = new �渶����();
		
		// ����ؾߵ� �޼����̸��� �⺻����()�̴�. ���ϴ�!
		u1.�⺻����(u2);
		u2.�⺻����(u3);
		u3.�⺻����(u1);
		u1.�⺻����(u4);
		u1.�⺻����(u5);
		
	}

}
