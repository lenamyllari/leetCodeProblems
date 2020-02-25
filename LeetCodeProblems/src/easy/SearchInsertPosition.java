package easy;

public class SearchInsertPosition {
	public static void main(String args[]) {
		int[] nums= new int[]{1,2,3,5};
	
		System.out.println(searchInsert(nums, 4));

	}
	
    public static int searchInsert(int[] nums, int target) {
    	int i = 0;
        for (i= 0; i< nums.length; i++) {
        	if(nums[i]>=target) {
        		return i;
        	}
        }
        return i;
    }
    /*binary search
     *  public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return start;
    }
     */
}
