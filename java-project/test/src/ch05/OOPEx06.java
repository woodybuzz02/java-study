package ch05;

class 프로토스유닛 {
	String name = "프로토스유닛";
	
	void 기본공격(프로토스유닛 e1) { // 추상화를 통해 슈퍼클래스의 메서드 무효화
		System.out.println("프로토스유닛 메서드");
		}
	
	String 이름확인() { // 추상화를 통해 슈퍼클래스의 메서드 무효화
		return "?";
	}
}

class 질럿 extends 프로토스유닛 {
	String name = "질럿";
	
	// 오버라이드 -> 부모의 메서드를 무효화한다 , 단 참조변수는 부모 참조변수값(프로토스유닛) 사용
	void 기본공격(프로토스유닛 e1) {
		// System.out.println("질럿 메서드");
		System.out.println("질럿이 "+e1.이름확인()+"을 공격합니다.");
	}
	
	// 오버라이드 -> 부모의 메서드를 무효화하다
	String 이름확인() {
		return name;
	}
}

class 드라군 extends 프로토스유닛 {
	// 서브클래스의 참조변수를 사용하기위해서 메서드안에 참조변수이름을 정의하여 사용하면 된다.
	String name = "드라군";
	
	void 기본공격(프로토스유닛 e1) {
		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
	}
	
	String 이름확인() {
		return name;
	}
}

class 다크템플러 extends 프로토스유닛 {
	String name = "다크템플러";
	void 기본공격(프로토스유닛 e1) {
		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
	}
	
	String 이름확인() {
		return name;
	}
}

// 신입 -> 리버라는 유닛을 하나 만들어봐 (오버라이드해서 만들어!)
// 팀장 -> 프로토스유닛으로 상속 (공격메서드, 이름을 확인하는 메서드 필요해)
//		-> name이라는 변수 하나 만들어!! -> 리버
// 누구를 공격하라는 거죠? 프로토스 유닛
// 테스트를 해봐
// 팀장님 ?가 뜨는데요?
// 아 그거 너 메서드 이름 머라고 적었어? -> 이름체크
// 아 친구야!! 기본공격이라고 이름 좀 바꿔봐!!
class 리버 extends 프로토스유닛 {
	String name = "리버";
	
//	void 공격(프로토스유닛 e1) {
//		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
//	}
	
	void 기본공격(프로토스유닛 e1) {
		System.out.println(this.name+"이 "+e1.이름확인()+"을 공격합니다.");
	}
	
	// 오버라이딩이 안됐네 -> 무효화가 안되자나
//	String 이름체크() {
//		return name;
//	}
	
	String 이름확인() {
		return name;
	}
}

public class OOPEx06 {

	public static void main(String[] args) {
		
		프로토스유닛 u1 = new 질럿(); // (질럿, 프로토스 유닛)
		프로토스유닛 u2 = new 드라군(); // (드라군, 프로토스 유닛)
		프로토스유닛 u3 = new 다크템플러(); // (다크템플러, 프로토스 유닛)
		프로토스유닛 u4 = new 리버();
		
		// 동적바인딩 -->  부모클래스 u1 = new 자식클래스(); 의 경우 둘 다 같은 메서드 이름을 가질경우 동적바인딩에 의해 자식메서드를 사용
		u1.기본공격(u2);
		u2.기본공격(u3); 
		u1.기본공격(u4); 
		u4.기본공격(u1); 
	}

}
