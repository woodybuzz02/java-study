package ch05;

interface MoveAble{
	
	// public abstract이 생략되어있음.
	void 위();
	void 아래();
	void 왼();
	void 오();
	void 냄새맡기();
}

interface MoveAble2{
	
	// public abstract이 생략되어있음.
	void 위();
	void 아래();
	void 왼();
	void 오();
	void 땅바닥숨기();
}

abstract class 사나운동물 implements MoveAble{
	abstract void 공격(); // 미완성된 함수
	
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
	}
	
	@Override
	public void 왼() {
		System.out.println("왼쪽으로 이동");
	}
	
	@Override
	public void 오() {
		System.out.println("오른쪽으로 이동");
	}
	
	@Override
	public void 위() {
		System.out.println("위로 이동");
	}
	
	// 완성시킨다. 다 코로 냄새를 맡을 것이니까
	@Override
	public void 냄새맡기() {
		System.out.println("냄새맡기");
		
	}
}

abstract class 온순한동물 implements MoveAble2{
	abstract void 채집(); // 미완성된 함수
	
	@Override
	public void 아래() {
		System.out.println("아래로 이동");
	}
	
	@Override
	public void 왼() {
		System.out.println("왼쪽으로 이동");
	}
	
	@Override
	public void 오() {
		System.out.println("오른쪽으로 이동");
	}
	
	@Override
	public void 위() {
		System.out.println("위로 이동");
	}
	
	@Override
	public void 땅바닥숨기() {
		System.out.println("땅바닥으로 숨기");
	}
	
}

// 구현이 자식 클래스로 위임(위, 아래, 왼, 오)
class 원숭이 extends 온순한동물{

	@Override // 어노테이션 = JVM이 실행시에 분석해서 확인= JVM의 힌트
	void 채집() {
		System.out.println("바나나 채집");
	}
	
}

class 소 extends 온순한동물{

	@Override
	void 채집() {
		System.out.println("풀 채집");
		
	}
	
}

class 코뿔소 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("몸통 박치기");
	}
	
}

class 호랑이 extends 사나운동물{

	@Override
	void 공격() {
		System.out.println("이빨 공격");
	
	}
	
}

// 신입아 말 (상속 온순한동물)

class 말 extends 온순한동물 {

	@Override
	void 채집() {
		System.out.println("각설탕 채집");
		
	}
	
}

public class OOPEx09 {
	
	static void 조이스틱(온순한동물 u1) {
		u1.땅바닥숨기();
		u1.채집();
		u1.위();
		u1.왼();
		u1.오();
		u1.아래();
		System.out.println("============");
	}
	
	static void 조이스틱(사나운동물 u1) {
		u1.공격();
		u1.위();
		u1.왼();
		u1.오();
		u1.아래();
		u1.냄새맡기();
		System.out.println("============");
	}
	
	public static void main(String[] args) {
		원숭이 u1 = new 원숭이();
		
		조이스틱(u1);
		
		소 u2 = new 소();
		
		조이스틱(u2);
		
		코뿔소 u3 = new 코뿔소();
		
		조이스틱(u3);
		
		호랑이 u4 = new 호랑이();
		
		조이스틱(u4);
		
		말 u5 = new 말();
		
		조이스틱(u5);
	}

}
