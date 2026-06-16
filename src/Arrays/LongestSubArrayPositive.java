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
//    int longest2(int[] arr, int k){
//        int n = arr.length;
//        int sum = arr[0];
//        int maxLen = 0;
//        int left =0, right =0;
//        while (right < n){
//            while(left <= right && sum > k);
//        }
//
//    }

    public static void main(String[] args) {
        LongestSubArrayPositive subArray = new LongestSubArrayPositive();
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(subArray.longest(arr,15));
    }
}
