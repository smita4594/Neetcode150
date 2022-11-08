package arraysNhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
//49
//Accepted
public class GroupAnagram {
	public static void main(String args[]) {
		String[] strs = {"a"};
		List<List<String>> list = groupAnagrams(strs);
		System.out.println(list);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list=new ArrayList<List<String>>();
		HashMap<Integer,List<String>> anagramMap=new HashMap<Integer,List<String>>();
		for(int i=0;i<strs.length;i++)
		{
			char []arr = strs[i].toCharArray();
	        Arrays.sort(arr); 
	        String sortedString=String.valueOf(arr);
	        int key=sortedString.hashCode();
	        if(anagramMap.containsKey(key))
	        {
	        	List<String> stringList=anagramMap.get(key);
	        	stringList.add(strs[i]);
	        	anagramMap.put(key, stringList);
	        }
	        else
	        {
	        	List<String> stringList=new ArrayList<String>();
	        	stringList.add(strs[i]);
	        	anagramMap.put(key, stringList);
	        }
		}
		for(List<String> maplist:anagramMap.values())
		{
			list.add(maplist);
		}
		return list;

	}
}

