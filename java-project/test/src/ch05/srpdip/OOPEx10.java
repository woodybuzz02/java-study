package ch05.srpdip;

interface talkAble{
	// public abstract이 생략되어있음.
	void talk();
}

abstract class 홀직원 implements talkAble{
	abstract void 청소();
	
	@Override
	public void talk() {
		System.out.println("손님과 대화");	
	}
}

abstract class 종업원 extends 홀직원{
	void 서빙하기() {
		System.out.println("서빙하기");
	}
//	void 주문받기() {
//		System.out.println("주문받기");
//	}
// 이제 주문을 키오스크로 받기때문에 주문받기가 필요없어졌다.
}

abstract class 캐셔 extends 홀직원{
//	void 정산하기() {
//		System.out.println("정산하기");
//	}
	void 정산하기() {
		System.out.println("계산기 정산하기");
	}
//	void 계산하기() {
//		System.out.println("계산하기");
//	}
	void 계산하기() {
		System.out.println("카드 계산하기");
	}
}

abstract class 요리사 {
	abstract void 요리하기();
}

class 홍길동 extends 종업원{
	
	요리사 j; // 의존성 역전 원칙

	@Override
	void 청소() {
		System.out.println("화장실청소");		
	}
	
}

class 임꺽정 extends 종업원{
	
	요리사 j; // 의존성 역전 원칙

	@Override
	void 청소() {
		System.out.println("주방청소");		
	}
	
}

class 김유신 extends 캐셔{

	@Override
	void 청소() {
		System.out.println("홀청소");	
	}
	
}

class 이몽룡 extends 캐셔{

	@Override
	void 청소() {
		System.out.println("테이블청소");		
	}
	
}

//class 장보고 extends 요리사{
//
//	@Override
//	void 요리하기() {
//		System.out.println("양식 만들기");		
//	}
//	
//}
// 이렇게 해도 코드 오류가 나지않는다. 왜냐하면 장보고에 의존한 것이 아닌 요리사에 의존을 한 것이기때문이다.

class 전몽준 extends 요리사{

	@Override
	void 요리하기() {
		System.out.println("양식 만들기");		
	}
	
}

class 이순신 extends 요리사{

	@Override
	void 요리하기() {
		System.out.println("한식 만들기");		
	}
	
}

public class OOPEx10 {
	

}
