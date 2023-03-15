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
