package arraysNhashing;

import java.util.HashMap;
//242. Valid Anagram
//https://leetcode.com/problems/valid-anagram/
//Accepted

public class ValidAnagram {
	public static void main(String args[])
	{
		String s="rat";
		String t="car";
		System.out.println(isAnagram(s,t));
	}
public static boolean isAnagram(String s, String t) {
	HashMap<Character,Integer> anagramMap=new HashMap<Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(anagramMap.containsKey(s.charAt(i)))
		{
			int count=anagramMap.get(s.charAt(i));
			anagramMap.put(s.charAt(i), count+1);
		}
		else
		{
			anagramMap.put(s.charAt(i),1);
		}
	}
	for(int i=0;i<t.length();i++)
	{
		if(!anagramMap.containsKey(t.charAt(i)))
		{
			return false;
		}
		else
		{
			int count=anagramMap.get(t.charAt(i));
			if(count==1)
			{
				anagramMap.remove(t.charAt(i));
				
			}
			else
			{
				anagramMap.put(t.charAt(i), count-1);
			}
			
		}
		
	}
	
	return anagramMap.size()==0;
        
    }

}
