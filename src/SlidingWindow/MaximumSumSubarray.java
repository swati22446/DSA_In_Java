package SlidingWindow;

public class MaximumSumSubarray {
    int maxSum(int[] nums, int k){
        int max = 0;
        int n = nums.length;
        for(int i=0; i<(n-k)+1 ;i++){
            int currentSum=0;
            for(int j = i; j <i+k ;j++){
                currentSum += nums[j];
            }
            max = Math.max(max,currentSum);
        }
        return max;
    }


    public static void main(String[] args) {
        MaximumSumSubarray sub= new MaximumSumSubarray();
        int[] nums = {1 , 4, 1, 10, 25, 3, 5, 0, 26};
        System.out.println(sub.maxSum(nums,4));
    }
}



