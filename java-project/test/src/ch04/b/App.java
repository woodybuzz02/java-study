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
