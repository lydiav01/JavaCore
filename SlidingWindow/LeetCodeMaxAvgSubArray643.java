package io.javabrains;

public class LeetCodeMaxAvgSubArray643 {

	public double findMaxAverage(int[] nums, int k) {
		int start_index = 0;
		int end_index = k;
		int sum = 0;
		int maxsum = 0;

		for (int i = 0; i < k; i++) {
			sum += nums[i];
			maxsum = sum;

		}
        //Starting Sliding Window
		while (end_index < nums.length) {
			sum -= nums[start_index];
			start_index++;
			sum += nums[end_index];
			end_index++;
			maxsum = Math.max(maxsum, sum);

		}
		return (double) maxsum / k;

	}

}
