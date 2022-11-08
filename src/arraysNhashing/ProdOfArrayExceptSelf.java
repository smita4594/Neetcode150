package arraysNhashing;

import java.util.Arrays;

//Accepted but Revisit.
//238
//https://leetcode.com/problems/product-of-array-except-self/
public class ProdOfArrayExceptSelf {
	public static void main(String[] args)
	{
		int[] nums= {-1,1,0,-3,3};
		int result[]=productExceptSelf(nums);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
public static int[] productExceptSelf(int[] nums) {
	int n=nums.length;

	int result[]=new int[n];
	Arrays.fill(result, 1);
	int curr=1;
	for(int i=0;i<n;i++)
	{
		result[i]=result[i]*curr;
		curr=curr*nums[i];
	}
	curr=1;
	for(int i=n-1;i>=0;i--)
	{
		result[i]=result[i]*curr;
		curr=curr*nums[i];
	}
	return result;
        
    }

}
