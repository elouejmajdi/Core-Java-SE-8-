package the3profe.jse8.algorithms;

public class StrStr {
	
	
    public static  int strStr(String haystack, String needle) {
       
        
        if(haystack.length()<needle.length())
        {
        	return -1;
        }
        
        return haystack.indexOf(needle);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// String haystack = "hello", needle = "ll";
		
		String haystack = "aaaaa", needle = "bba";
		
		System.out.println(strStr(haystack, needle));
	}

}
