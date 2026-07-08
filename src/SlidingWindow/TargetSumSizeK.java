package SlidingWindow;

public class TargetSumSizeK {
    int targetSum(int[] nums, int target , int k){
        int n =nums.length;
        int count =0;
        int currentSum =0;
        for(int i=0; i < k; i++){
            currentSum += nums[i];
        }
        if(currentSum == target) count++;

        for(int i=0 ; i < n-k; i++){
            currentSum -= nums[i];
            currentSum += nums[i + k];
            if(currentSum ==target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        TargetSumSizeK num = new TargetSumSizeK();
        int[] arr ={2,3,2,2,3,1,3,8,5,0,2,4};
        System.out.println(num.targetSum(arr,7,3));
    }
}
