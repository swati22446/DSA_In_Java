package SlidingWindow;

public class FindSubarraySumNonNegative {
    boolean findSum(int[] nums, int sum){ //my approach with n squared
        int n = nums.length;
        int beg = 0;
        int last = 0;
        while(last < n){
            int k = 0;
            for(int i = beg ; i< last+1; i++){
                k += nums[i];
            }
            if(sum == k) return true;
            else if(k > sum) beg += 1;
            else{
                last +=1;
            }

        }
        return false;
    }
    boolean findSum2(int[] arr, int sum){
        int n = arr.length;
        int start = 0;
        int window_sum = 0;
        for(int i =0; i<n; i++) {
            window_sum += arr[i];
            while (window_sum > sum) {
                window_sum -= arr[start];
                start += 1;
            }
            if (window_sum == sum) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        FindSubarraySumNonNegative sun = new FindSubarraySumNonNegative();
        int[] arr = {3,1,4,9,2,1,7,5};
        System.out.println(sun.findSum(arr,10));
        System.out.println(sun.findSum2(arr,10));

    }
}
