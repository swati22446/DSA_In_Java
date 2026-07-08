package SlidingWindow;

public class MaxProductSubArray {
    int maxProductSubarray(int[] nums, int k){
        int n = nums.length;
        int currentProd =1;
        int max = currentProd;
        for(int i=0; i<k; i++) {
            currentProd *= nums[i];
        }
//        max =currentProd;
        for(int i =0; i<n-k; i++){
            currentProd /= nums[i];
            currentProd *= nums[i+k];
            if(currentProd > max) max = currentProd;

        }
        return max;
    }

    public static void main(String[] args) {
        MaxProductSubArray num = new MaxProductSubArray();
        int[] arr = {4,2,1,-9,8,2,3};
        System.out.println(num.maxProductSubarray(arr,3));
    }
}
