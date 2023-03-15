# ch6. 배열/조건문/반복문/컬렉션/제네릭

### 배열

연관된 데이터를 저장하기 위한 자료 구조

배열을 사용하면 하나의 변수로도 여러개의 데이터를 저장할 수 있다.

```java
package ch06;

public class ArrayEx01 {

	public static void main(String[] args) {
		
//		배열로 데이터를 저장한다면
//
//		1) 연속된 3개의 int형 공간 필요
//
//		2) 데이터 읽기가 빠르다.
//
//		3) 시작번지만 바라본다.
//
//		4) 0번지부터 시작한다.
		
		int[] nums = {4,5,6}; // 연관된 데이터를 연속되게 저장했다.
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		// System.out.println(nums[3]); 이 배열은 length가 3이다. 그래서 범위가 벗어났다고 나온다.
	}

}

package ch06;

public class ArrayEx02 {

	public static void main(String[] args) {
		int[] nums = new int[3]; // 힙에 3개의 공간이 생성됨
		
		nums[0] = 4;
		nums[1] = 3;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]); // 0이 나온다. int의 값이 초기화되지 않으면 0이 나온다.
	}

}

// 2차원 배열
package ch06;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		// 리터럴 방식
		int[][] nums = {{1,2,3},{4,5,6}}; // [2][3]
		
		System.out.println(nums[0][0]); // 1
		System.out.println(nums[0][2]); // 3
		System.out.println(nums[1][1]); // 5
		
		// new 객체생성 방식
		int[][] nums2 = new int[2][2];
		nums2[0][0] = 1;
		nums2[0][1] = 2;
		nums2[1][0] = 3;
		nums2[1][1] = 4;
		
		System.out.println(nums2[1][0]); // 3
	}

}
```

### 반복문

```java
package ch06;

public class ForEx01 {

	public static void main(String[] args) {

		// 표현식(expression) ex.for(), while()
		// for(); 이런 식으로 호출하지 않아도 시행되는 메서드같은 것를 표현식(expression)이라고 한다. 
		
		for(int i=1; i<101; i=i+1) {// i는 지역변수, for라는 스택 내부에서 정의되었다.
		// int i=1; 초기화 (for문이 시작될 때 단 한번만 실행된다.)
		// i=i+1 증감식(증가 or 감소) (for문이 한번 실행된 이후 부터 계속 실행)
		// i<101 조건문 (처음부터 끝까지 계속 실행
			System.out.println(i);
		}

	}

}

package ch06;

public class ForEx02 {
	public static void main(String[] args) {
		
		// 구구단
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
	}
}

package ch06;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int n = 1;
		
		// 표현식(expression)
		// for랑 while의 차이점은 끝이 있냐 없냐의 차이다.
		// 즉, for는 반복횟수를 알 수 있을 때 사용할 수 있고 while은 반복횟수를 알 수 없을 때 사용할 수 있다.
		while(n < 10) { // 주어진 조건이 참일 때 반복
			System.out.println(n);
			n++;
		}

	}

}
```

### 조건문

```java
package ch06;

public class ConEx03 {

	public static void main(String[] args) {
		int point = 70;
		
		// 90점이 넘으면 차를 주겠다.
		// 80점이 넘으면 자전거를 사주겠다.
		// 그게 아니면 백만원을 반납해라.
		
		if(point>90) { // 1. 만약 90점을 넘는다면?
			System.out.println("용돈줌");
		}else if(point>80){ // 2. 90점을 넘지 못하고 80점을 넘는다면
			System.out.println("자전거줌");
		}else { // 3. 위 두 조건을 만족하지 못했을 때
			System.out.println("백만원반납");
		};

	}

}
```

### Object 클래스

자바 클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로 java.lang.Object 클래스를 상속하게 된다. 

→ 즉 Object 클래스는 모든 클래스의 부모이다. = 자바 최상위 부모 클래스

```java
package ch06;

class Dog extends Object{
	String name = "토토";
}

class Cat {
	String name = "야옹이";
}

public class ObjectEx01 {

	public static void main(String[] args) {
		
		// Object 클래스는 모든 클래스의 부모
		
		Object o1 = new Dog(); //다형성
		Object o2 = new Cat();
		
		Dog d1 = (Dog) o1;
		Cat c1 = (Cat) o2;
//		Cat c2 = (Cat) o1; 이거는 안된다. 같은 메모리 공간에 떠있는 것만 가능하다.
		
		System.out.println(d1.name);
		System.out.println(c1.name);
	}

}

package ch06;

class 궁수{
	String name = "궁수";
}

class 전사 {
	String name = "전사";
}

public class ObjectEx02 {

	public static void main(String[] args) {
		
//		궁수[] s1 = new 궁수[2];
//		s1[0] = new 궁수();
//		s1[1] = new 궁수();
		
		// 궁수와 전사를 같이 저장하고 싶다.
		// 오브젝트는 어떤 타입들을 묶어서 사용할 때 유용하게 쓸 수 있다.
		
		Object[] s1 = new Object[2];
		s1[0] = new 궁수();
		s1[1] = new 전사();
		
		// 단점 - 다운캐스팅 -> 하지않는다면 필드값을 불러올 수 없다. 왜냐하면 데이터가 부모클래스인 Object를 바라보고 있기 때문이다.
		
		궁수 g1 = (궁수)s1[0];
		전사 g2 = (전사)s1[1];
		
		System.out.println(g1.name);
		System.out.println(g2.name);
	}

}
```

### 제네릭

제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다. 한마디로 특정(Specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입이라는 것이다.

```java
package ch06;

// 경우에 따라 문자열을 담고, 숫자를 담고
class 바구니{
	Object data;
}

public class GenericEx01 {

	public static void main(String[] args) {
		바구니 s1 = new 바구니();
		s1.data = 1;
		System.out.println(s1.data);
		
		바구니 s2 = new 바구니();
		s2.data = "문자열";
		System.out.println(s2.data);
	}

}

package ch06;

class 호랑이{
	String name = "호랑이";
}

class 사자{
	String name = "사자";
}

// 어떤 객체를 만들 때 타입이 정해져 있지 않으면 오브젝트로 하면 불편하니 제네릭이라는 문법을 쓰는 것 ex.<T>
class 큰바구니<T>{
	T data;
}

public class GenericEx03 {

	public static void main(String[] args) {
		큰바구니<호랑이> s1 = new 큰바구니<>();
//		s1.data = new 호랑이();
//		
//		호랑이 h1 = (호랑이) s1.data; // 다운캐스팅 해야되서 불편
//		
//		System.out.println(h1.name);
		s1.data = new 호랑이();
		System.out.println(s1.data.name);
		
		큰바구니<사자> s2 = new 큰바구니<>();
		s2.data = new 사자();
		System.out.println(s2.data.name);
	}

}

package ch06;

abstract class 공{
	abstract String getName();
}

// 상태를 직접적으로 접근하지 못하고 메소드로 접근 가능
class 농구공 extends 공{
	private String name = "농구공";

	// 자식이 부모의 메서드와 동일한 것을 들고 있으면
	// 부모의 메서드가 오버라이드(무효화)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class 축구공 extends 공{
	private String name = "축구공";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class 가방<T>{
	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}

public class GenericEx02 {
	
	static 가방<? extends 공> 꺼내기(int time) {//9시 축구 12시 농구 //와일드 카드 사용
		if (time == 9) {
			축구공 g2 = new 축구공();
			가방<축구공> b2 = new 가방<>();
			b2.setData(g2);
			return b2;
		}else {
			농구공 g1 = new 농구공();
			가방<농구공> b1 = new 가방<>();
			b1.setData(g1);
			return b1;
		}
	}

	// 제네릭 고급 = 다형성, Object, 추상클래스, 오버라이드(무효화)
	// 동적바인딩
	public static void main(String[] args) {
		
//		농구공 g1 = new 농구공();
//		축구공 g2 = new 축구공();
//		
//		가방<농구공> b1 = new 가방<>();
//		b1.setData(g1);
//		가방<축구공> b2 = new 가방<>();
//		b2.setData(g2);
//		
//		System.out.println(b1.getData().getName());
		
		가방<? extends 공> r1 = 꺼내기(9); //  와일드 카드 사용
		가방<? extends 공> r2 = 꺼내기(12);
		
		System.out.println(r1.getData().getName());
		System.out.println(r2.getData().getName());
	}

}

```

### 컬렉션

```java
package ch06;

import java.util.ArrayList;

public class CollectionEx01 {

	public static void main(String[] args) {
		
		//기본자료형은 값을 가지고 있지만 레퍼런스자료형은 주소를 가지고있다.
		//제네릭은 기본자료형이 안들어간다.
		//래핑클래스 = Integer,Double,Character,Boolean 기본자료형을 레퍼런스자료형처럼 만들어주는 클래스이다.
		ArrayList<Integer> c1 = new ArrayList<>();
		
		c1.add(1);
		c1.add(2);
		
		System.out.println(c1.get(0));
		
//		for (int i = 0; i < c1.size(); i++) {
//			System.out.println(c1.get(i));
//		}
		// 메서드를 계속 호출하는 것은 안좋음.
		
		int size = c1.size();
		
		for (int i = 0; i < size; i++) {
			System.out.println(c1.get(i));
		}
	}

}
```