# ch4. 객체지향 프로그래밍 문법


### 패키지

. java 파일 모음

### import

다른 패키지에 있는 파일을 사용하고자 할 때 import한다.

ex) 

📂 a

Cal.java

📂 b

App.java

- b패키지에 있는 App.java에서 a패키지에 있는 Cal.java를 사용하고자 할 때 import ch04.a.Cal;를 쓰면 된다.

### 접근제어자

변수와 함수, 클래스에 대한 접근을 제한하는 문법

1. 디폴트 접근제어자(동일한 패키지에서만 접근 가능)
2. Public 접근제어자(다른 패키지에서도 접근 가능)
3. Private 접근제어자(동일한 클래스에서만 접근 가능)

ex) 

📂 a

Cal.java

App2.java

📂 b

App.java

```java
// Cal.java

package ch04.a;

public class Cal {
	
	int num = 10;
	
	void add() {
		System.out.println("더하기 메서드");
	}
	
	public void minus() {
		System.out.println("빼기 메서드");
	}
	
	private void multi() {
		System.out.println("곱하기 메서드");
	}
	
	public void divide() {
		System.out.println("나누기 메서드");
		multi(); // 같은 클래스이기때문에 접근할 수 있다.
	}
}

// App2.java
package ch04.a;

public class App2 {

	public static void main(String[] args) {
		Cal c = new Cal();
		c.add();
		c.minus();
		// c.multi(); // 찾을 수 없다. 같은 클래스가 아니기때문이다.
		System.out.println(c.num);
		
	}

}

// App.java

package ch04.b;

import ch04.a.Cal;

// main이 있는 자바파일을 실행파일이라고 한다.
public class App {

	// JVM이 main메서드를 찾으려면 public이 필요하다.(공개)
	// JVM이 main메서드를 찾으려면 static이 필요하다.(메모리에 올린다.)
	// main메서드만 return 타입을 허용하지않는다.
	// 메서드의 이름은 main이다.
	public static void main(String[] args) {
		Cal c = new Cal(); // new 생성자를 이용해 힙영역에 올린다.
		c.minus();
		// System.out.println(c.num); 디폴트 접근제어자이기때문에 찾을수없다.
	}

}
```

### 라이브러리 만들기

라이브러리는 프로그램을 효율적으로 개발할 수 있도록 자주 사용하는 함수나 데이터들을 미리 만들어 모아 놓은 집합체이다.

- 표준 라이브러리: 프로그래밍 언어에 기본적으로 포함되어 있는 라이브러리
    - 여러 종류의 모듈이나 패키지 형태
- 외부 라이브러리: 개발자들이 필요한 기능들을 만들어 인터넷 등에 공유해 놓은 것으로, 외부 라이브러리를 다운받아 설치 후 사용

![](https://velog.velcdn.com/images/woodybuzz/post/7f9412ac-cadb-4cf3-87d1-57351bb8f6b7/image.png)

jar는 패키지 모음이다.

메인메소드의 유무에 따라 Runnable JAR(유)과 JAR(무)로 구분된다.

프로젝트 내부에 있는 것 말고 다른 프로젝트에 있는 파일을 쓰고싶을 때 **build path**를 해야된다.

![](https://velog.velcdn.com/images/woodybuzz/post/87edd2b8-b759-4dec-8bb0-d607879bb37b/image.png)


Referenced Libraries 내부에 recipe.jar 파일이 있는 것을 확인할 수 있다. 이때 import를 해서 사용하면 된다.

```java
package ch04;

import java.util.Random;

import recipe.MySoup;

// JDK 설치 - JDK(javac, java), JRE(라이브러리), JDK(자바가상머신)
public class LibEx01 {

	public static void main(String[] args) {
		MySoup m = new MySoup();
		m.김치찌개();
		
		Random r  = new Random();
		System.out.println(r.nextInt());
	}

}
```

### 클래스만들기(final)

클래스 = 설계도

final로 선언을 하면 변경을 할 수 없게 된다.

```java
package ch04;

// 클래스 = 여러가지 특징(상태)을 가지고 있다.
// int -> 한가지의 상태만 가질 수 있다.
// String -> 한가지의 상태만 가질 수 있다.
public class Dog {
	int age = 20; // 변경가능
	String name = "복실이"; // 변경가능
	String color = "하얀색"; // 변경가능
	final String type = "말티즈"; // 변경불가능(상수)
}

// 변수, 필드, 전역변수(지역변수가 아니다, 메서드 내부에서 만들어진 것이 아니다.), 힙변수, 상태
```

```java
package ch04;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog(); // heap공간에 띄운다.
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.name);
		System.out.println(d1.type);
		
		// 1년이 지났다. 강아지가 염색을 했다. 이름도 바꿨다.
		d1.age = d1.age +1;
		d1.name = "화이트";
		d1.color = "노란색";
		// d1.type = "푸들"; final을 붙여서 상수가 되었다.
		System.out.println(d1.age);
		System.out.println(d1.color);
		System.out.println(d1.name);
		System.out.println(d1.type);
		
	}

}
```

### 클래스만들기(생성자)

생성자는 클래스명과 같은 이름을 가진 메서드이며 초기화 작업을 위해 사용한다.

```java
package ch04;

// 값을 초기화하지 않는 이유는 new 할 때마다 다른 상태를 가진 고양이를 생성하기 위해서 이다.
public class Cat {
	String name; // 초기화하지않았다.
	String color; // 힙공간
	
	// Cat() 생성자를 디폴트(기본) 생성자라고 한다. (매개변수가 없는 것)
	// 개발자가 적지 않아도 있는 것!!(생략가능한 코드)
	public Cat() {
		
	}
	
	// 개발자가 직접 생성자 구현함 = 디폴트 생성자가 생기지 않음
	public Cat(String n, String c) { // 생성자(메서드)
		System.out.println("고양이탄생");
		System.out.println("n : "+ n);
		System.out.println("c : "+ c);
		
		// String n, String c 는 지역변수 = Cat() 이라는 생성자(메서드)가 가진 지역변수, 스택공간
		name = n;
		color = c;
	}
	
//	String name = "집사"; // 클래스만들어서 상태를 정의할 때 값을 초기화하지않는다.
//	String color = "하얀색";
}
```

```java
package ch04;

public class CatApp {
	public static void main(String[] args) {
		
		// new - > 메모리에 할당 (heap) -> String name, String color
		// Cat() -> 생성자 호출 -> 상태를 초기화하기 위해서
		// c1 -> heap 공간을 가르키는 주소
		// Cat 커스텀 타입(개발자가 만든 타입)
		Cat c1 = new Cat("집사1", "하얀색"); // 고양이 한마리가 힙공간에 만들어짐.
		System.out.println(c1.name); // null자체도 데이터. 값이 없음을 의미!
		System.out.println(c1.color);
		
		Cat c2 = new Cat("집사2", "노란색"); // 고양이 한마리가 힙공간에 만들어짐.
		System.out.println(c2.name);
		System.out.println(c2.color);
	}
}
```

위 코드에서 **Cat( )** 이 디폴트 생성자이며 생략가능하다.

매개변수를 갖는 임의의 생성자를 만들었다면 디폴트 생성자는 자동으로 생성되지 않는다.

new 연산자를 이용하여 다른 상태(state)를 갖는 객체를 만들기 위해서는 변수 초기화를 하지않고 String name와 같이 변수 선언을 한다.

### 클래스만들기(this)

this는 자기자신의 힙공간을 가리킨다.

```java
package ch04;

// this는 자기자신의 힙공간을 가리킨다.
public class People {
	String name;
	int age;
	
	public People() {

	}
	// 디폴트 생성자가 있을까요? 있음 -> .java -> .class 컴파일할 때 자바가 자동으로 코드를 만들어줌
	public People(String name, int age) {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		this.name = name;
		this.age = age;
	}
	
}
```

```java
package ch04;

public class PeopleApp {
	public static void main(String[] args) {
		People p1 = new People("홍길동", 25);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
```

![](https://velog.velcdn.com/images/woodybuzz/post/e88a656a-fac5-47b8-a2e0-7c684a05953f/image.png)

출처 : 이지업 컨텐츠 내의 데어프로그래밍 자바강의