
public class Main {
	
	public static void main(String[] args) {
		int[] nums = {4, 8, 3, 1, 2, 6};
		
		for(int i=0; i<nums.length-1; i++) {
			int min = nums[i];
			int index = 0;
			for(int j=i; j<nums.length; j++) {
				if(nums[j]<=min) {
					min = nums[j];
					index=j;
				}
			}
			int temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;
		}			

		for(int val: nums) {
			System.out.print(val + ", ");
		}

	}

}
