package easy;

public class IntSquareRoot {
	
	public static void main(String args[]) {
		int num = 8;
		int sqrt = mySqrt(num);
		//int num2 = 4;
		//int sqr2 = mySqrt(num2);
		System.out.println(sqrt);
	}/*
	private static int binarySearch(long low, long high, int x) {        
        if (low == high)
            return (int)low;
        long mid = (high + low) / 2;
        if ((mid * mid == x) || (low == mid))
            return (int)mid;
        else if (mid * mid > x) {
        	System.out.println(mid*mid);
            return binarySearch(low, mid, x);}
        else
            return binarySearch(mid, high, x);
    }
    
    public static int mySqrt(int x) {
        if (x == 0)
            return 0;
        return binarySearch(1, x, x);
    }*/
    public static int mySqrt(int x) {
    	if (x==0) {
    		return 0;
    	}
    	else if(x<4) {
    		return 1;
    	}
    	int max = x;
    	int min = 1;
    	int middle=0;
    	while(min<max) {
    		 middle = (max-min)/2 + min;
    		System.out.println(middle + " middle");
    		
    		if(Math.floor(x/middle)==middle || x/middle<middle && x/(middle+1)>middle) {
    			System.out.println("x " + x + " middle "+ middle + " / " + x/middle);
    			return middle;
    		}
    		else if(x/middle>middle) {
    			min = middle+1;
    			
    		}
    		else {
    			max = middle;
    		}
    	}
        return min;
    }
}
