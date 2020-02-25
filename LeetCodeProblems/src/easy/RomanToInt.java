package easy;

public class RomanToInt {
	public static void main(String args[]) {
		System.out.println(romanToInt2("CMXCIX"));
		
		System.out.println(romanToInt2("IV"));
		System.out.println(romanToInt2("LXIX"));
		System.out.println(romanToInt2("MMDCCCIV"));
		System.out.println(romanToInt2("MCMXCIV"));
		
	}
	public static int romanToInt(String s) {
		int ones = 0;
		if (s.contains("I")) {
			ones = s.lastIndexOf("I")-s.indexOf("I")+1;

		}
		if (s.contains("V")) {
			if(s.indexOf("I") < s.indexOf("V") && s.indexOf("I")>=0) {
				ones= 4;
			}
			else {
				ones +=5;
				}
		}
		int tens = 0;
		if(s.contains("X")) {
			if(s.indexOf("I") < s.lastIndexOf("X") && s.indexOf("I")>=0) {
				ones= 9;
				if(s.indexOf("X") == s.lastIndexOf("X")) {
					tens -=10;
				}
				else {
					tens -=20;
				}
			}
			tens += (s.lastIndexOf("X")-s.indexOf("X")+1) * 10;
		}
		if (s.contains("L")) {
			if(s.indexOf("X")<s.indexOf("L") && s.indexOf("X")>=0) {
				tens = 40;
			}
			else {
				tens +=50;
			}
		}
		int hundreds = 0;
		if(s.contains("C")) {
			if(s.indexOf("X")<s.lastIndexOf("C") && s.indexOf("X")>=0) {
				if(s.indexOf("C") == s.lastIndexOf("C")) {
					hundreds -=100;
				}
				else {
					hundreds -=200;
				}
				tens = 90;
			}
			hundreds += (s.lastIndexOf("C")-s.indexOf("C")+1) * 100;
		}
		if(s.contains("D")) {
			if(s.indexOf("C")<s.lastIndexOf("D") && s.indexOf("C")>=0) {
				hundreds = 400;
			}
			else {
				hundreds += 500;
			}
		}
		int thousands = 0;
		if(s.contains("M")) {
			if(s.indexOf("C")<s.lastIndexOf("M") && s.indexOf("C")>=0) {
				if(s.indexOf("M") == s.lastIndexOf("M")) {
					thousands -=1000;
				}
				else {
					thousands -=2000;
				}
				hundreds =900;
			}
			thousands += (s.lastIndexOf("M")-s.indexOf("M")+1) * 1000;
		}
        return ones+tens+hundreds + thousands;
        
    }
	  public static int romanToInt2(String s) {
	        if(s==null || s.length() == 0){
	            return 0;
	        }
	        
	        int value = 0;
	        char prevCharacter = Character.MIN_VALUE;
	        for(int i=s.length()-1; i>=0; i--){
	            
	           switch(s.charAt(i)){
	               case 'I' : 
	                   if(prevCharacter == 'V' || prevCharacter == 'X') {
	                      value -= 1; 
	                   }else{
	                     value = value+1;
	                   }
	                   break;
	               case 'V' : 
	                   value = value+5;
	                   break;
	               case 'X' :
	                   if(prevCharacter == 'L' || prevCharacter == 'C') {
	                      value -= 10; 
	                   }else{
	                     value += 10;
	                   }
	                   break;
	               case 'L': 
	                   value += 50;
	                   break;
	               case 'C':
	                   if(prevCharacter == 'M' || prevCharacter == 'D') {
	                      value -= 100; 
	                   }else{
	                     value += 100;
	                   }
	                   break;
	               case 'D':
	                   value += 500;
	                   break;
	               case 'M':
	                   value +=1000;
	                   break;
	           }
	            prevCharacter = s.charAt(i);
	        }
	        return value;
	    }
}
