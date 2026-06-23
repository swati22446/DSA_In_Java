package SlidingWindow;

public class SumOfSubArrayLongest {

    int longestSubArray(int[] nums, int k) {
        int left = 0, right = 0;
        int n = nums.length;
        int len = 0;
        int sum = nums[0];

        while (right < n) {

            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                len = Math.max(len, right - left + 1);
            }

            right++;

            if (right < n) {
                sum += nums[right];
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        SumOfSubArrayLongest subsum = new SumOfSubArrayLongest();
        System.out.println(subsum.longestSubArray(arr, 6));
    }
}