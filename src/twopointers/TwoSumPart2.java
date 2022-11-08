package twopointers;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//167
//Accepted
public class TwoSumPart2 {
	public static void main(String[] args) {
		int numbers[] = { 2, 7, 11, 15 };
		int target = 9;
		int result[] = twoSum(numbers, target);
		for (Integer nums : result) {
			System.out.println(nums);
		}

	}

	public static int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		int index1 = 0;
		int index2 = numbers.length - 1;
		while (index1 < index2) {
			int sum = numbers[index1] + numbers[index2];
			if (sum == target) {
				result[0] = index1 + 1;
				result[1] = index2 + 1;
				return result;
			} else if (sum > target) {
				index2--;
			} else {
				index1++;
			}
		}
		return result;
	}

}
