package arraysNhashing;

import java.util.HashMap;

//https://leetcode.com/problems/longest-consecutive-sequence/
//128
//Accepted but need to revisit
public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(longestConsecutive(nums));
	}

	public static int longestConsecutive(int[] nums) {
		// To handle empty nums array
		if (nums.length == 0)
			return 0;

		HashMap<Integer, Boolean> map = new HashMap<>();

		/*
		 * 
		 * maxLength = max length of consecutive subsequence tempLength = temporary
		 * length of consecutive subsequence
		 */
		int maxLength = 1, tempLength = 1;

		// This for loop will put a true for each element in the Hashmap
		for (Integer val : nums)
			map.put(val, true);

		// This for loop will check if each element can be a potential starting point
		for (Integer val : nums) {
			if (map.containsKey(val - 1))
				map.put(val, false);
		}

		// This for loop calculates the longest consecutive subsequence
		for (Integer val : nums) {
			if (map.get(val)) {
				int temp = val;
				while (map.containsKey(++temp))
					tempLength++;
				if (tempLength > maxLength) {

					maxLength = tempLength;
				}
				tempLength = 1;
			}
		}
		return maxLength;
	}

}
