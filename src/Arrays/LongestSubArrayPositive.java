package Arrays;
import java.util.HashMap;

public class LongestSubArrayPositive {
    int longest(int[] nums, int k){
        int len =0;
        int n = nums.length;
        for(int i =0; i < n ; i++){
            for(int j =i; j<n ;j++){
                int sum =0;
                for(int l =i ; l<=j ;l++){
                    sum +=nums[l];

                }
                if(sum == k) len = Math.max(len, j -i +1);
            }
        }
        return len;
    }
    int longestSubArrayBetterBrute(int[] arr, int k){
        int n = arr.length;
        int len = 0;
        int sum;
        for(int i =0; i < n; i++){
            sum =0;
            for(int j =i; j< n; j++){
                sum += arr[j];
                if (sum == k) len = Integer.max(len, j - i +1);
            }
        }
        return len;
    }
//    int longestSubArrayIncludingZero(int[] arr, int k){
//        int n = arr.length;
//        int len = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int sum = 0;
//        for(int i = 0; i<n; i++){
//            sum += arr[i];
//            if(sum == k) {
//                len = Integer.max(len, i+1);
//            }
//
//            int rem = sum - k;
//
//
//        }
//    }

    public static void main(String[] args) {
        LongestSubArrayPositive subArray = new LongestSubArrayPositive();
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(subArray.longest(arr,15));
//        System.out.println(subArray.longestSubArrayBetterBrute(arr,15));
    }
}
