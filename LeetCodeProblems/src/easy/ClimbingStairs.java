package easy;
/*
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 * 4:
 * 1,1,1,1
 * 2,2
 * 1,2,1
 * 1,1,2
 * 2,1,1
 */

public class ClimbingStairs {
	public static void main(String args[]) {
		int num = 4;
		int amountOptions = climbStairs(num);
		System.out.println(amountOptions);
	}
    public static int climbStairs(int n) {
    	int [] num = new int[2];
    	num[0]=0;
    	num[1]=1;
    	if(n<2) {
    		return num[n];
    	}
    	int amount=0;
    	for(int i=1; i<=n; i++) {
    		amount = num[0]+num[1];
    		num[0]=num[1];
    		num[1]=amount;
    	}
        return amount;
    }
}
