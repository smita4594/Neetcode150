package arraysNhashing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//347
//https://leetcode.com/problems/top-k-frequent-elements/
//Accepted
public class TopKFrequent {
	
	public static void main(String[] args)
	{
		int[] nums= {1};
		int k=1;
		int[] result=topKFrequent(nums,k);
		for(int i=0;i<result.length;i++)
		{
		System.out.println(result[i]);
		}
	}
public static int[] topKFrequent(int[] nums, int k) {
	HashMap<Integer,Integer> occurenceMap=new HashMap<Integer,Integer>();
	HashSet<Integer> occurenceSet=new HashSet<Integer>();
	
	int[] result=new int[k];
	
	for(int i=0;i<nums.length;i++)
	{
		if(occurenceMap.containsKey(nums[i]))
		{
			int count=occurenceMap.get(nums[i]);
			occurenceMap.put(nums[i], count+1);
		}
		else
		{
			occurenceMap.put(nums[i], 1);
		}
	}
	Integer[] uniqueElementsArray=new Integer[occurenceMap.size()];
	int i=0;
	for (Map.Entry<Integer,Integer> entry : occurenceMap.entrySet()) 
	{
		uniqueElementsArray[i]=entry.getValue();
		i++;
		
	}
	Arrays.sort(uniqueElementsArray,Collections.reverseOrder());
    for(int j=0;j<k;j++)
    {
    	occurenceSet.add(uniqueElementsArray[j]);
 
    }
    int l=0;
    for (Map.Entry<Integer,Integer> entry : occurenceMap.entrySet()) 
	{
		if(occurenceSet.contains(entry.getValue()))
		{
			result[l]=entry.getKey();
			l++;
		}
		
	}
	return result;
        
    }

}
