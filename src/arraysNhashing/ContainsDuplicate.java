package arraysNhashing;

import java.util.HashSet;
import java.util.Set;
//217. Contains Duplicate
//https://leetcode.com/problems/contains-duplicate/
//Accepted
public class ContainsDuplicate {
	public static void main(String args[])
	{
		int nums[]= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
public static boolean containsDuplicate(int[] nums) {
	Set<Integer> duplicateSet=new HashSet<Integer>();
	for(int i=0;i<nums.length;i++)
	{
		if(duplicateSet.contains(nums[i]))
		{
			return true;
		}
		else
		{
			duplicateSet.add(nums[i]);
		}
	}
	return false;
	
        
    }

}
