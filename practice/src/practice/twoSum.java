package practice;

import java.util.Arrays;

public class twoSum {
	public static void main(String[] args) {
		int [] array = {1,2,3,6,5};
		int t = 8;
		System.out.println(Arrays.toString(sum(array, t)));
	}
	
	public static int[] sum(int[] nums, int target) {
		int[] arr = new int[2];
		for(int i = 0; i < nums.length-1; i ++) {
			for(int j =i+1; j< nums.length-1; j++) {
				if(nums[i]+nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
				}

			}
		}
		
		
		return arr;
		
	}
}
