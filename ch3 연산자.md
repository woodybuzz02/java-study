# ch3. 연산자

### 대입 연산자

대입 연산자는 =이다. 오른쪽에 있는 것을 왼쪽에 대입한다는 의미이다.

```java
package ch03;

public class OperEx01 {

	public static void main(String[] args) {
		int num = 10; // 대입연산자 = , 10이라는 데이터를 int type의 num 변수에 대입.
	}

}
```

### 사칙연산자

덧셈(+), 뺄셈(-), 나눗셈(/), 곱셈(*)을 의미한다.

이때 덧셈의 경우 숫자끼리는 수치 연산이되지만 그외의 경우는 결합이 된다.

```java
package ch03;

// 사칙연산 +, -, /, *

public class OperEx02 {

	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		int sum = n1 + n2; // 수치 연산
		System.out.println(sum);
		
		String s1 = "반가워 나의 나이는 ";
		int age = 25;
		System.out.println(s1 + age); //  결합
		
		System.out.println(5-3);
		System.out.println(10/2);
		System.out.println(2*20);
	}

}
```

### 비교연산자

비교 연산자는 크기의 비교를 의미하며 return값은 true 혹은 false로 나온다.

```java
package ch03;

public class OperEx03 {

	public static void main(String[] args) {
		// 리턴의 결과 true, false
		System.out.println(1==1); // 같나요?
		System.out.println(1==2);
		System.out.println(5!=3); // 같지않나요? !는 부정의 의미
		System.out.println(3>1); // 크나요?
		System.out.println(3<1); // 작나요?
		System.out.println(2<=2); // 작거나 같나요?
		System.out.println(2<=3); // 작거나 같나요?
		System.out.println(2>=2); // 크거나 같나요?
		System.out.println(2>=1); // 크거나 같나요?
	}

}
```

### 논리연산자

비교연산자를 쓰고 논리 연산자를 쓴다.

AND(&&) → 모두 true라면 true

OR(||) → 하나라도 true라면 true

```java
package ch03;

public class OperEx04 {

	public static void main(String[] args) {
		System.out.println(1 == 1 && 1==2); // true and false -> false
		System.out.println(1 == 1 || 1==2);	 // true or false -> true, 둘중 하나만 true라면 true
		
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1==n1 || n1==n2);
		
		// 상수 = 변하지않는 수(1)
		// 변수 = 변하는 수(n1)
	}

}
```

### 조건연산자

삼항 연산자라고도 한다.

조건(비교연산자) ? true : false

```java
package ch03;

public class OperEx05 {

	public static void main(String[] args) {
		// 삼항 연산자 = 조건 연산자
		int n1 = 5;
		// 조건(비교연산자) ? true : false
		System.out.println(n1 == 5 ? "5가 맞습니다." : "5가 아닙니다.");
		int point = 59;
		System.out.println(point >= 60 ? "시험에 통과되었습니다" : "재수강해야합니다.");
		String result = point >= 60 ?  "시험에 통과되었습니다" : "재수강해야합니다.";
		System.out.println("결과 : "+result);
		
		boolean result2 = 1==1;
		System.out.println("결과 : "+result2);
		
		int result3 = point < 60 ? 0 : 1;
		System.out.println("결과 : "+result3);
	}
}
```

### 나머지 연산자

/ (몫) 

% (나머지)

```java
package ch03;

public class OperEx06 {

	public static void main(String[] args) {
		System.out.println(130/100); // 몫
		System.out.println(130%100); // 나머지
		
		int money = 130; // 100원 1개, 10원 3개
		System.out.println("100원 : "+money/100);
		System.out.println("10원 : "+(money%100)/10);
	}

}
```

### 형변환

type을 변환하는 것을 의미한다.

캐스팅이라고도 하며 업캐스팅과 다운캐스팅이 있다.

업캐스팅은 묵시적 형변환이며 기본 자료형중에서 크기가 작은 type을 크기가 큰 type으로 변환하는 경우를 말한다.

다운캐스팅은 명시적 형변환이며 크기가 큰 type을 크기가 작은 type으로 변환하는 경우를 말하며 오른쪽 피연산자에 왼쪽 피연산자의 type을 ( ) 안에 적어준다. 

다운캐스팅을 할 경우 데이터가 유실될 수 있다는 단점이 있다.

```java
package ch03;

public class CastEx01 {

	public static void main(String[] args) {
		// 캐스팅(다운캐스팅, 업캐스팅)
		int n1 = 100; // 4Byte
		double d1 = n1; // 8Byte (8Byte <- 4Byte)
		System.out.println(d1); // 업캐스팅(묵시적)
		
		double d2 = 100.8;
		// 명시적 형변환 (int) 다운 캐스팅
		int n2 = (int)d2; // double은 int로 변환할 수 없다.
		System.out.println(n2); // 단점 : 데이터가 유실될 수 있다.
		
		int money = 130;
		System.out.println(130/100);
		System.out.println(money/100);
		System.out.println(money/100.0); // int/double => double, int/double의 값 타입은 크기가 큰 타입을 따라간다. 
	}

}
```

출처 : 이지업 컨텐츠 내의 데어프로그래밍 자바강의