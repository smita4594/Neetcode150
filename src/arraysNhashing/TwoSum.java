package arraysNhashing;

import java.util.HashMap;

//1
//https://leetcode.com/problems/two-sum/submissions/
//Accepted
public class TwoSum {
	public static void main(String args[])
	{
		int[] nums= {2,7,11,15};
		int[] result=twoSum(nums,9);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
public static int[] twoSum(int[] nums, int target) {
	HashMap<Integer,Integer> sumMap=new HashMap<Integer,Integer>();
	int[] result=new int[2];
	for(int i=0;i<nums.length;i++)
	{
		if(sumMap.containsKey(target-nums[i]))
		{
			result[0]=sumMap.get(target-nums[i]);
			result[1]=i;
		}
		else
		{
		sumMap.put(nums[i], i);
		}
	}
	
	return result;
        
    }
}
