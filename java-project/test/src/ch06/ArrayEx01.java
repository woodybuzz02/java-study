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
