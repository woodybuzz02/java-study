# ch2. 자바 메모리 구조

### 일반변수와 레퍼런스 변수

```java
package ch02;

// new가 되어서 힙에 할당이 될 때 그때 자바가 사이즈를 알 수 있다. (프로그램이 실행되었을 때 = Runtime)
class MyData{
	int id = 1; // 4Byte
	int price = 1000; // 4Byte
}

// 레퍼런스(참조) 변수, 일반 변수
public class VarRefEx01 {

	public static void main(String[] args) {
		// 타입 변수; int num; 변수를 선언하다.
		// 타입 변수 = 값; int num = 10; 변수를 초기화(메모리에 할당)한다.
		int num = 10; // 일반변수 (크기가 정해져 있는 것 = 컴파일시점)
		MyData d = new MyData(); // 내가 만든 타입은 자바입장에서 사이즈를 알 수 없다. 이런 변수를 레퍼런스 변수라고 한다.
						// 레퍼런스변수 (크기가 정해져 있지 않는 것 = 컴파일시점)
		
		System.out.println(num);
		System.out.println(d.id);
		System.out.println(d.price);
	}
```

컴파일될 때 크기가 정해져 있는 것을 일반변수라고 하고, 크기가 정해져있지않은 것은 레퍼런스변수라고 한다.

사용자가 임의로 만든 커스텀타입은 컴파일될 때 크기를 알 수없고 프로그램이 실행되었을 때(Runtime)에 크기를 알 수 있다.

![](https://velog.velcdn.com/images/woodybuzz/post/7b36cb2b-604d-4272-af16-52b808af3669/image.png)

커스텀 타입은 프로그램이 실행되면 항상 4Byte의 크기를 갖고있다.

new MyData();가 실행되는 순간 크기가 8Byte임을 알 수 있다.

즉 , 컴파일시 크기를 알 수 없어 메모리 공간 설계를 하지 못하고 JVM이 실행되는 순간 stack 영역에 주소값을 가지고 있고 heap 영역에서 실제 값을 가진다.

> 일반변수(기본자료형) → 값 (컴파일시 크기 알 수 있다.)
레퍼런스 변수(class자료형=Bean)  → 주소 (=포인터, 컴파일시 크기를 알 수 없다) → 값
> 

### 메서드

![](https://velog.velcdn.com/images/woodybuzz/post/019b2cd2-5796-4f54-962a-8bebbbba159f/image.png)

```java
package ch02;

class 손님 {
	
	// 손님의 행위
	void 커피마시기( ) {
		System.out.println("손님이 커피를 마셔요.");
	}
}

public class MethodEx01 {
	
	// 메서드 = MethodEx01 클래스의 행위
	// static이 붙어있지않으면 메모리에 뜨지 않는다.
	static void start() {
		System.out.println("만나서 반갑습니다."); // String 타입
		System.out.println("start 메서드 종료");
	}

	public static void main(String[] args) {
		MethodEx01.start();  // 함수의 내부가 실행이 된다.
		손님 s = new 손님();
		s.커피마시기(); // 함수의 내부가 실행이 된다.
	}

}
```

start( ) 메서드와 main( ) 메서드는 MethodEx01 클래스의 행위이다.

jvm이 static을 찾은 후 main( ) 메서드를 실행한다.

메서드를 호출하는 방법은 MethodEx01.start();와 같이 클래스명.메서드명( );를 작성하면 된다.

같은 클래스안에 있기때문에 클래스명을 생략해서 메서드명( );만 작성해도 된다.

메서드를 호출하면 함수의 내부(={ })가 실행이 된다.

손님 클래스와 같이 static이 적혀져있지않는 경우가 있다.

new 연산자를 활용하여 참조변수(레퍼런스 변수) s를 stack 영역에 두어 주소를 가르키고 heap 영역에 실제값이 참조값을 둔다.

손님 클래스와 같은 경우의 메서드를 호출하는 방법은 참조변수.메서드명( );을 하면 된다.

### 메서드 Stack 메모리

어떤 자료가 저장되는 구조를 자료구조라고 한다.

자료구조에는 큐(queue)와 스택(stack)이 있다.

![](https://velog.velcdn.com/images/woodybuzz/post/13aa2605-6bd4-4d7f-99f5-5100136641aa/image.png)


큐는 들어온 순서대로 처리를 하며 스택은 큐와 반대로 마지막에 들어온 것부터 처리를 한다.

```java
package ch02;

public class StackEx01 {
	
	static void a() {
		StackEx01.b();
		System.out.println("a2");
		System.out.println("a3");
		System.out.println("a4");
	}
	static void b() {
		System.out.println("b1");
		System.out.println("b2");
		System.out.println("b3");
	}

	public static void main(String[] args) {
		System.out.println("m1");
		System.out.println("m2");
		StackEx01.a();
		System.out.println("m4");
		System.out.println("m5");
	}

}
```

![](https://velog.velcdn.com/images/woodybuzz/post/077b0a84-0440-455b-bd4d-deeb08ecc2de/image.png)
![](https://velog.velcdn.com/images/woodybuzz/post/27b84d6f-c394-421a-82d1-f8803ed0022b/image.png)
![](https://velog.velcdn.com/images/woodybuzz/post/98e5fd97-8176-4a51-bad5-6e593702804c/image.png)

1. StackEx01.java은 StackEx01.class로 컴파일
2. StackEx01.class 실행
3. JVM이 .class를 로드
4. static을 찾기 → static에는 a(), b(), main()가 올라간다.
5. main( )를 실행
6. main queue가 오픈이 되어 코드들이 올라가고main( )도 stack에 올라간다.
7. 코드들이 하나씩 실행된다
    
    7_1. 19, 20 실행되고 21번째 줄이 실행된다. → a( ) 호출
    
    7_2. a queue가 오픈이 되어 코드들이 올라가고 a( )도 stack에 올라간다.
    
    7_3. 그 후 코드들이 하나씩 실행된다.
    
    7_3_1. 6번째 줄이 실행된다. → b( ) 호출
    
    7_3_2.  b queue가 오픈이 되어 코드들이 올라가고 b( )도 stack에 올라간다.
    
    7_3_3. 그 후 코드들이 하나씩 실행된다. (13, 14, 15 실행) → stack에서 b( )가 지워진다.(pop)
    
    7_3_4. 6번째 줄로 돌아간 후 6번째 줄의 실행을 마친다.
    
    7_3_5. 7, 8, 9 실행된다. → stack에서 a( )가 지워진다.(pop)
    
    7_4.  21번째 줄로 돌아간 후 21번째 줄의 실행을 마친다. 
    
    7_5. 22, 23 실행된다.
    
8. main()가 종료된다.

### 지역변수와 전역변수

지역변수 → stack (생명주기가 짧다)

전역변수 → heap, static (생명주기가 길다)

```java
package ch02;

/*
 * 정리 : Stack(지역변수=메서드가 실행될 때 메모리에 할당된다=메서드가 종료될 때 메모리에서 사라진다)
 * 	      Heap(전역변수=new할 때 메모리에 할당된다=더이상 참조하지 않을 때 메모리에서 자동으로 사라진다)
 *        Static(전역변수=main메서드가 실행되기 전에 메모리에 할당된다=main메서드가 종료되면 메모리에서 사라진다)
 */

public class StackEx02 {
	
	static int sum = 20; // 전역변수(static) main메서드가 할당되기 전에 sum이 할당된다.
	int value = 50; // 전역변수(heap) // 더이상 참조하지 않을 때 자동으로 사라진다.
	
	static void a() {
		// a메서드가 실행될 때 stack공간에 n1이 할당되고 a메서드가 종료되면 메모리에 사라진다.
		int n1 = 1; // a메서드의 스택영역에 저장됨(지역변수)(stack)
		System.out.println(n1);
		
		// 24번 라인이 실행되려고 할 때 static공간에 할당되어야하는데 불가능하다. static공간 할당은 main메서드 실행전에만 가능하다.
		// static int n2 = 2; - 오류
	}

	public static void main(String[] args) {
		a(); // 메서드를 호출한다.
		// System.out.println(n1);
		StackEx02 s = new StackEx02(); // new를 하면 static이 아닌 모든 것들이 로드된다.
		// 17번 라인에서 heap공간에 value가 할당된다.
		System.out.println(s.value);
		System.out.println("test1 - 더이상 s 변수를 참조하지 않기때문에 메모리에서 자동으로 사라진다.");
	}

}
```

### 메서드의 리턴

```java
public class MethodEx02 {
	
	// void는 리턴(돌려주지)하지 않겠다는 뜻
	static int add() { // 호출되면 중괄호 내부가 실행된다. 이때 Stack 공간이 메모리에 만들어진다.
		int sum = 5+6;
		// System.out.println(sum); // 화면에 출력
		return sum;
	}
	
	public static void main(String[] args) {
		int result = add(); // add() 메서드 호출
		System.out.println(result);
	}

}
```

![](https://velog.velcdn.com/images/woodybuzz/post/d9d8a4b1-75b9-4cee-9212-f7692c42afd2/image.png)


메서드가 실행되면 stack 영역에 로드된다.

메서드에서 return이 필요한 이유는 stack의 생명주기가 짧기 때문에 stack 내부의 값을 호출한 쪽에 돌려주어야 값을 사용할 수 있다.

return을 사용할 것이라면 해당 메서드의 type과 동일한 type을 써야한다.

### 메서드의 매개변수와 인수

자판기로 예시로 들자면 매개변수는 동전투입구, 지폐투입구, 카드투입구라고 보면 되고 인수는 동전, 지폐, 카드라고 보면 된다.

```java
package ch02;

public class MethodEx03 {
	
	static void 자판기_음료_돌려주기(int coin) {
		System.out.println("동전을 투입하였습니다.");
	}
	
	static void 자판기_음료_돌려주기2(double paper) {
		System.out.println("지폐를 투입하였습니다.");
	}
	
	static void 자판기_음료_돌려주기3(String card) {
		System.out.println("카드를 투입하였습니다.");
	}
	
	static void add(int n1, int n2) {//매개변수 2개
		System.out.println("더하기 메서드가 호출이 되었습니다.");
		int sum = n1 + n2;
		System.out.println(sum);
	}
	 
	public static void main(String[] args) {
		자판기_음료_돌려주기(1000);
		자판기_음료_돌려주기2(1000.50);
		자판기_음료_돌려주기3("현대카드");
		add(1,2);
	}

}
```

매개변수 = 메서드의 소괄호( )안에 들어가는 변수 ex) int coin, double paper, String card, int n1, int n2

인수 = 메서드를 호출했을 때 임의로 넣는 값 ex) 1000, 1000.50, "현대카드", 1, 2

출처 : 이지업 컨텐츠 내의 데어프로그래밍 자바강의