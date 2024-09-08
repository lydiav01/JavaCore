package io.javabrains;

public class LeetCodeSubArraySum560 {

	public int subarraySum(int[] nums, int k) {
		int x = 0;
		int result = 0;
		if(nums.length == 1 && nums[0] == k) {
			x++;
		}

		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] == k || nums[i + 1] == k) {

				x++;
			} else {
				result = nums[i + 1] + nums[i];
				if (result == k) {

					x++;
				}
			}
		}
		return x;
	}

}
