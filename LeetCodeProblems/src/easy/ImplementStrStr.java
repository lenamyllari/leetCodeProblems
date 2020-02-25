package easy;

public class ImplementStrStr {
	
	public static void main(String args[]) {
		String haystack = "mississippi", needle = "issip";
		String haystack2 = "aaaaa", needle2 = "bba";
		int unique = strStr(haystack, needle);
		System.out.println(unique);
		int unique2 = strStr(haystack2, needle2);
		System.out.println(unique2);
	}
	
	public static int strStr(String haystack, String needle) {
		if (needle.length()==0){
			return 0;
		}
		else if(haystack.contains(needle)) {
			for(int i=0; i<haystack.length();i++) {
				if(haystack.charAt(i)==needle.charAt(0)){
					int firstIndex = i;
					for(int j=0; j<needle.length(); j++) {
						if(haystack.charAt(firstIndex+j)!=needle.charAt(j)) {
							break;
						}
						else if(j==needle.length()-1) {
							return firstIndex;
						}	
					}
				}
			}
		}
        return -1;
    }
}
