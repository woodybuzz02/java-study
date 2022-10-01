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
