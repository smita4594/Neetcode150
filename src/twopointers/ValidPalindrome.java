package twopointers;
//https://leetcode.com/problems/valid-palindrome/
//125
//Accepted
public class ValidPalindrome {
	public static void main(String args[])
	{
		String s=" ";
		System.out.println(isPalindrome(s));
	}
    public static boolean isPalindrome(String s) {
    	
    	s=s.toLowerCase();
    	s = s.replaceAll(
    	          "[^a-zA-Z0-9]", "");
    	int length=s.length();
    	int start=0;
    	int end=length-1;
    	while(start<end)
    	{
    		char startChar=s.charAt(start);
    		char endChar=s.charAt(end);
    		if(startChar!=endChar)
    		{
    			return false;
    		}
    		start++;
    		end--;
    	}
		return true;
        
    }

}
