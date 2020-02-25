package easy;

import java.util.ArrayList;
import java.util.Stack;

public class ValidParentheses {
	public static void main(String args[]) {
		//System.out.println(isValid("  "));
		
		//System.out.println(isValid("([)]"));
		//System.out.println(isValid("([{{{  )"));
		System.out.println(isValid("([ ])"));
		//System.out.println(isValid("[ {])}("));
		System.out.println(isValid("(){}"));
	}
	
	public static boolean isValid(String s) {
		Stack<Character> paranthesis = new Stack<>();
		//delete all whitespaces and tabs
		s=(s.replaceAll("\t", "")).replaceAll("\\s","");
		//empty - > always true
		if(s.length()==0) {
	    	   return true;
	       }
		//odd amount -> always false
		else if (s.length()%2!=0) {
			System.out.println("3");
	    	   return false;
	       }
		else {
			System.out.println(s);
			int amount = s.length()-1;
			int i = 0;
			 while(i < s.length()) {
				System.out.println(paranthesis);
				if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
					paranthesis.push(s.charAt(i));
					System.out.println("push");
					
			    } else {
			        if(paranthesis.isEmpty()) {
			        	System.out.println("1");
			           return false;
			        }
			        System.out.println("pop");
			        char currOpen = paranthesis.pop();
			        if(currOpen == '[' && s.charAt(i) != ']' || currOpen == '{' && s.charAt(i) != '}' ||
			                 currOpen == '(' && s.charAt(i) != ')') {
			        	System.out.println("curropen " + currOpen);
			        	System.out.println("s.charAt(i) " + s.charAt(i));
			        	System.out.println("2");
			            return false;
			        }
			                
			    }
				i++;
			}
			return paranthesis.isEmpty();
		}
			
		
	}
	
	//only for case for parenthesis inside paranthesis
	public static boolean isValid2(String s) {
		s=s.replaceAll("\\s","");
		s=s.replaceAll("\t", "");
		if(s.length()==0) {
	    	   return true;
	       }
		else if (s.length()%2!=0) {
	    	   return false;
	       }
		int amount = s.length()-1;
		for(int i = 0; i<amount; i++) {
			if(amount!=i && amount>i) {
				switch(s.charAt(i)) {
					case '(':
						if (s.charAt(amount)!=')') {
							return false;
						}
						else {
							break;
						}
					case '{':
						if (s.charAt(amount)!='}') {
							return false;
						}
						else {
							break;
						}
					case '[':
						if (s.charAt(amount)!=']') {
							return false;
						}
						else {
							break;
						}
					default:
				}
				
			}
			amount--;
		}
		
        return true;
    }
}
/*
 * String[] paranthesisOpen =  {"(", "{", "["};
			String[] paranthesisClose =  {")", "}", "]"};
			for(int i = 0; i<paranthesisOpen.length-1; i++) {
				//different amount of closing and opening -> false
				if(s.length() - s.replace(paranthesisOpen[i], "").length() != s.length() - s.replace(paranthesisClose[i], "").length()) {
					return false;
				}
				//closing before opening -> false
				else if(s.indexOf(paranthesisClose[i])<s.indexOf(paranthesisOpen[i])) {
					return false;
				}
				*/
