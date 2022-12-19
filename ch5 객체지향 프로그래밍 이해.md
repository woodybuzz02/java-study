# ch5. 객체지향 프로그래밍 이해



### 클래스와 오브젝트와 인스턴스

![](https://velog.velcdn.com/images/woodybuzz/post/58f03e6c-c47a-4f86-a698-cbc58c1aa8b6/image.png)



영어에서는 구체적인 것(셀 수 있는 것)= 물질명사, 추상적인 것(셀 수 없는 것) =  추상명사로 한다.

의자, 침대, 탁자, 책상, 장농 같은 것은 아주 구체적인 것이며 이것들을 하나의 이름으로 부르고 싶을 때 이것들을 가구라고 한다. 가구는 추상적인 것으로 볼 수 있다.

가구 클래스는 추상적이므로 new를 쓸 수 없으므로 추상 클래스(.java파일)이고 의자 클래스는 new가 가능하기때문에 클래스이자 오브젝트라고 볼 수 있다. 또한 나무의자와 둥근의자는 메모리에 올라왔으므로 new가 되었기 때문에 인스턴스이다.

### 클래스의 상태와 행위

객체지향프로그램 OOP(Object Oriented Programing)에서 상태(=필드)는 행위(=메서드)에 의해서 변경되어야한다. (즉 클래스의 필드는 메서드에 의해 변한다)

누군가는 상태(=필드)를 직접 변경할 수 있기 때문에 상태(=필드) 앞에 접근제어자 private를 붙여서 접근 할 수 없도록 해야한다.

```java
package ch05;

// 접근제어자 = 디폴트 접근제어자, public 접근제어자, private 접근제어자
class Player {
	// 상태 = 필드
	// 값을 초기화하지않은 이유는 new할 때마다 다른 상태를 가진 player를 생성하기 위해서이다.
	String name;
	private int thirsty; // 외부 클래스에서 접근 불가능
	
	// 생성자는 클래스명과 같은 이름을 가진 메서드
	// new 연산자와 같이 사용되어 클래스로부터 객체를 생성할 때 객체의 초키화를 위해 사용
	// 클래스 내부에 생성자 선언을 생략하면 컴파일러가 클래스 내부에 기본생성자(default constructor)를 바이트 코드에 자동으로 추가
	// 매개변수를 갖는 임의의 생성자를 만들었다면 기본 생성자를 필수적으로 만들어야한다.
	// this는 자기자신의 힙공간
	public Player(String name, int thirsty) {
		this.name = name;
		this.thirsty = thirsty;
		// 스택으로 받은 String name, int thirsty을 heap에 넣기
	}
	// 행위 = 메서드 = 값을 변경
	void 물마시기() {
		System.out.println("물마시기 행위");
		this.thirsty = this.thirsty - 50;
	}
	
	int 목마름상태확인() {
		return this.thirsty;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Player p1 = new Player("홍길동", 100);
		System.out.println("이름은 "+p1.name);
		System.out.println("갈증지수는 "+p1.목마름상태확인()); // thirsty라는 변수를 찾을 수 없다.
		
		// 1. 첫번째 시나리오 = 마법 (x)
		// p1.thirsty = 50; // 원인이 없이 갈증지수 변경 = 마법
		// System.out.println("갈증지수는 "+p1.thirsty);
		
		// 2. 두번째 시나리오 = 상태가 행위를 변경함 (x) - 실수할 수 있음
		// p1.물마시기();
		// p1.thirsty = 50; // int thirsty;로 되어있어서 누군가는 상태(=필드)를 직접 변경할 수 있다. 디폴트 접근제어자는 패키지내부에서 접근할 수 있다.
		// System.out.println("갈증지수는 "+p1.thirsty);
		
		// 3. 세번째 시나리오
		p1.물마시기(); // 실수할 수 없음. private int thirsty;로 바꾸면 외부 클래스에서 접근 불가능.
		// p1.thirsty는 접근할 수 없기때문에 목마름상태확인()을 생성.
		System.out.println("갈증지수는 "+p1.목마름상태확인());
	}

}
```

### 상속과 컴포지션(결합)

![](https://velog.velcdn.com/images/woodybuzz/post/c74a708f-19e5-4c82-9c7d-a82de11af44d/image.png)

```java
package ch05;

class Engine {
	int power = 2000;
}

class Car { // 자동차는 엔진이 아니기 때문에 상속할 수 없다.
	// 잘 만들어진 것을 가져와서 쓰는 것
	// 컴포지션(결합)
	Engine e;
	public Car(Engine e) {
		this.e = e;
	}
}

class Hamburger{
	String name = "기본햄버거";
	String 재료1 = "양상추";
	String 재료2 = "패티";
}

// 상속은 상태와 행위를 물려받을 수 있지만 꼭 타입이 일치될 수 있어야 한다.
class CheeseHamburger extends Hamburger { // 치즈햄버거 = 햄버거
	// 겹치지 않는 상태(필드)만 물려받는다.
	String name = "치즈햄버거";
}

// 꼭 상속하지않아도 다른 클래스가 만든 것을 재사용해서 쓸 수 있다. -> 컴포지션(결합)
class ChickenHamburger{
	String name = "치킨햄버거";
	Hamburger h;
	public ChickenHamburger(Hamburger h) {
		this.h = h;
	}
}

public class OOPEx02 {

	public static void main(String[] args) {
		Engine e1 = new Engine();
		Car c1 = new Car(e1);
		System.out.println("자동차의 엔진 마력은 "+c1.e.power);
		CheeseHamburger ch1 = new CheeseHamburger();
		System.out.println("햄버거 이름 : "+ch1.name);
		System.out.println("재료 : "+ch1.재료1);
		System.out.println("재료 : "+ch1.재료2);
		
		Hamburger h1 = new Hamburger();
		ChickenHamburger ckh1 = new ChickenHamburger(h1);
		System.out.println(ckh1.name);
		System.out.println(ckh1.h.재료1);
		System.out.println(ckh1.h.재료2);
		System.out.println(ckh1.h.name);
	}

}
```

### 다형성

다형성은 하나의 타입에 여러개의 객체를 대입하여 다양한 기능을 이용할 수 있도록 하는 것이다.

부모클래스 인스턴스변수 =  new 자식클래스( ); 일 때 자동 타입변환이 일어나며 인스턴스 변수는 자식 객체를 바라보지만, 인스턴스 변수는 부모 클래스의 멤버에만 접근 가능하다.

![](https://velog.velcdn.com/images/woodybuzz/post/c07968e0-38ec-41a9-abde-c7596d3f739f/image.png)


```java
package ch05;

// 요리사
class 요리사 {
	String name = "요리사";
}

// 홍길동 or 요리사
class 홍길동 extends 요리사{
	String name = "홍길동";
}

public class OOPEx03 {

	public static void main(String[] args) {
		홍길동 h1 = new 홍길동(); // 힙공간에 홍길동과 요리사가 같이 떠있음.
		System.out.println(h1.name);
		
		요리사 y1 = new 홍길동(); // 이것이 가능한 이유는 힙공간에 홍길동과 요리사가 같이 떠있는데 바라보는 것을 요리사로 한 것이기 때문이다.
		System.out.println(y1.name);
		
		// 홍길동 h2 = new 요리사(); // 메모리에 뜬 것은 요리사만 떴기 때문에 홍길동을 바라볼수가 없어서 오류가 난다.
	}

}
```

### 오버로딩

클래스가 메서드를 가지고 있을 때 동일한 이름의 메서드를 또 생성할 수 없다.

하지만 어떤 클래스가 메서드를 가지고 있을 때 매개변수의 갯수가 다르거나 매개변수의 타입이 다르거나 혹은 매개변수의 갯수와 타입 둘 다 다르면 동일한 이름의 메서드를 생성할 수 있다. 이것을 오버로딩(overloading = 과적재)이라고 한다. 같은 함수명이지만 오버로딩을 할 경우 다른 함수로 인식을 한다.

```java
package ch05;

class 임꺽정 {
	void 달리기() {
		System.out.println("달리기1");
	}
	
	// 오버로딩
	void 달리기(int speed) {
		System.out.println("달리기2");
	}
	
	// 오버로딩
	void 달리기(double speed) {
		System.out.println("달리기3");
	}
	
	// 오버로딩
	void 달리기(int speed, double power) {
		System.out.println("달리기4");
	}
	
	void 달리기2() {
		System.out.println("달리기5");
	}
}

// 오버로딩 문법 끝!
// 오버로딩은 왜 사용하는가?

public class OOPEx04 {

	public static void main(String[] args) {
		임꺽정 e = new 임꺽정();
		e.달리기();
		e.달리기(1);
		e.달리기(5.0);
		e.달리기(1, 5.0);
		e.달리기2();
	}

}
```

### 오버로딩의 한계

어느정도 경우의 수의 제한이 있다면 메서드 이름 1개를 가지고 여러개의 기능구현이 가능하다.

그러나 경우의 수가 많을경우 메서드를 일일히 구현해야 하므로 좋지않다.

```java
package ch05;

class 전사 { // 검
	String name = "전사";
	
	void 기본공격(궁수 e1) {
		System.out.println("검으로 "+e1.name+" 공격하기");
	}
	
	// 오버로딩 (유닛이 100개라면)
	void 기본공격(광전사 e1) {
		System.out.println("검으로 "+e1.name+" 공격하기");
	}
	
	// 오버로딩 (유닛이 100개라면)
	void 기본공격(마법사 e1) {
		System.out.println("검으로 "+e1.name+" 공격하기");
	}
	
	// 오버로딩 (유닛이 100개라면)
	void 기본공격(흑마법사 e1) {
		System.out.println("검으로 "+e1.name+" 공격하기");
	}
	
	// 유닛이 100개라면 기본공격 메서드가 100개가 되어야 한다. 엄청난 단점!
	// 오버로딩은 어느 정도의 경우의 수가 제한이 되어있다면 좋다.
	// 하지만 경우의 수가 많다면 힘들다.
}

class 궁수 { // 활
	String name = "궁수";
	
	void 기본공격(광전사 e1) {
		System.out.println("활로 "+e1.name+" 공격하기");
	}
}

class 광전사 { // 도끼
	String name = "광전사";
	
	void 기본공격(전사 e1) {
		System.out.println("도끼로 "+e1.name+" 공격하기");
	}
}

class 마법사 { // 마법
	String name = "마법사";
	
	void 기본공격(전사 e1) {
		System.out.println("마법으로 "+e1.name+" 공격하기");
	}
}

class 흑마법사 { // 흑마법
	String name = "흑마법사";
	
	void 기본공격(전사 e1) {
		System.out.println("흑마법으로 "+e1.name+" 공격하기");
	}
}

public class OOPEx05 {

	public static void main(String[] args) {
		전사 u1 = new 전사();
		궁수 u2 = new 궁수();
		광전사 u3 = new 광전사();
		마법사 u4 =  new 마법사();
		흑마법사 u5 = new 흑마법사();
		
		// 기억해야될 메서드이름이 기본공격()이다. 편하다!
		u1.기본공격(u2);
		u2.기본공격(u3);
		u3.기본공격(u1);
		u1.기본공격(u4);
		u1.기본공격(u5);
		
	}

}
```

### 오버라이딩

오버라이딩은 추상화를 통해 부모클래스의 메서드를 무효화시키는 것이다. 동일한 참조변수 이름을 사용할 경우 부모클래스 참조변수 이름의 값을 사용한다. 따라서 서브 클래스의 참조변수를 사용하려면 메서드 안에 참조변수이름을 정의하여 사용하면 된다.

부모클래스 A = new 자식클래스(); 의 경우 둘 다 같은 메서드 이름을 가질 경우 동적바인딩에 의해 자식메서드를 사용한다.

![](https://velog.velcdn.com/images/woodybuzz/post/09c6401e-fbf2-4abb-b4d0-b8a68e634afe/image.png)


```java
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
```

### 추상클래스

추상클래스는 추상적인 것이다. new연산자로 인스턴스를 생성할 수 없다.

abstract 키워드가 포함된 메서드 없이, abstract 키워드를 클래스에만 추가해도 추상클래스가 된다.단 이때도 new 연산자로 인스턴스를 생성할 수 없다.

abstract 키워드가 포함된 메서드가 1개라도 있다면 클래스는 무조건 추상클래스가 되어야한다

추상메서드말고 몸체가 있는 어떤 메서드도 만들 수 있다.

추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다.

```java
package ch05;

// 추상클래스
abstract class Animal {
//	void speak() {} <- 어차피 안쓰는 거
	abstract void speak(); // 이렇게 만든다. 추상메서드(몸체{}가 없다.)
	
	void Hello() { // 몸체가 있는 어떤 메서드도 만들 수 있다.
		System.out.println("!!!");
	}
}

class Dog extends Animal{
	
	// 오버라이드(Animal의 speak()가 무효화된다.)
	void speak() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	
	// 오버라이드(Animal의 speak()가 무효화된다.)
	void speak() {
		System.out.println("야옹");
	}
}

// 신입아 Bird를 만들어!!, Animal을 상속해서 만들어! // sysout 짹짹!!
class Bird extends Animal{

	// 추상메서드를 부모가 가지고 있으면 자식은 추상메서드를 반드시 구현해야한다.
	@Override
	void speak() {
		System.out.println("짹짹");
		
	}
	
}

public class OOPEx07 {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Bird();
		
		a1.speak(); // 동적바인딩 된다. 왜? 부모의 메서드가 무효화되니까!!
		a2.speak();
		a3.speak();
		
		//Animal a3 = new Animal(); // 추상클래스라서 안됨
	}

}
```

### 인터페이스

인터페이스는 갑과 을이 존재하는 약속, 일방적인 약속, 제한된 행위(메소드)를 강제로 수행하도록 하는 것이다.

자바에서 인터페이스는 행위에 대한 제약이라고 볼 수 있다.

인터페이스는 미완성된 행위(메소드)의 구현을 강제하는 것을 목적으로 두고 추상클래스는 상속받은 다음에 기능을 사용하고 확장하는 것에 목적을 둔다.

![](https://velog.velcdn.com/images/woodybuzz/post/d2b889b8-9913-4119-8c81-70a971f778a8/image.png)


static은 메모리에 한번 할당되어 프로그램이 종료될 때 해제되는 것을 의미한다.

```java
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
```

### SRP와 DIP

SRP → Single Response Principle(단일책임원칙)

책임을 OOP에서는 행위라고 하고 행위는 메서드이다.(책임 → 행위 → 메서드)

책임을 분리하는 순간 문제가 생기면 명확하게 책임자가 누군지 알 수 있다. 즉 원인이 무엇인지 명확하게 알 수 있다.

DIP → Dependency Inversion Principle(의존성역전원칙)

구조적 디자인엣 특정 모듈에 구현체를 의존하지않고 추상화된 인터페이스나 상위클래스를 두어서 변화가 쉬운 구현체의 변화에 영향을 받지 않도록 하는 것이다.

![](https://velog.velcdn.com/images/woodybuzz/post/a96fc728-4b38-43c9-ac4b-8c277a20f3bd/image.png)


프로그램을 만들 때 처음부터 완벽하게 만들 수 없기때문에 CI(Continue Integretion 지속적 통합)를 고려해야한다. 이때 SRP와 DIP를 잘 지킨다면 수정이 편하다.

### SRP와 DIP 실습

홀직원은 종업원과 캐셔로 분류된다.

홀직원은 공통적인 업무가 청소가 있으며 각자 맡은 청소구역은 다르다.

종업원은 서빙하기와 주문받기 업무를 한다.

캐셔는 정산하기와 계산하기 업무를 한다.

요리사는 요리하기 업무를 한다. 각자 맡은 요리 종류는 다르다.

종업원은 요리사에게 의존을 한다. 이때 의존을 한다는 것은 음식을 해달라고 하는 것으로 이해하면 된다.

홀직원만 손님과 대화를 할 수 있다. 이 부분은 인터페이스로 구현한다.

키오스크로 교체되었기때문에 주문받기 업무는 사라졌다.

현금계산에서 카드계산으로 바뀌었다.

정산하기에서 계산기를 이용한 정산으로 바뀌었다.

양식을 담당한 요리사가 일을 그만두고 새로운 사람이 고용되었다.

```java
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
```

출처 : 이지업 컨텐츠 내의 데어프로그래밍 자바강의