package easy;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String args[]) {
		int[] nums= new int[]{0,0,1,1,1,2,2,3,3,4};
		int newNums = removeDuplicates(nums);
		//System.out.println(newNums);
		for(int i =0; i <newNums; i++ ) {
			System.out.println(nums[i]);
		}
	}
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int newLength = 1;
		for (int i = 1; i<nums.length; i++) {
			if (nums[i]!=nums[i-1]) {
				nums[newLength++] = nums[i];
			}	
		}
        return newLength;
    }
}
