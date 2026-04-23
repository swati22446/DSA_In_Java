package Arrays;
import java.util.*;

public class MissingNumber {
    // my approach1
    int miss(int[] nums){
        int n = nums.length;
        boolean[] arr = new boolean[n+2];
        for (int x : nums){
            arr[x] = true;
        }
        for(int i = 1; i < n; i++){
            if(!arr[i]){
                return i;
            }
        }
        return 0;
    }
// optimal approach
    int miss2(int[] arr){
        int n = arr.length;
        int sum = 0;
        int sumOfArray = 0;
        for(int i = 1; i <=n+1 ; i++){ // since there has to n+1 elements
            sum+=i;
        }
        for(int i =0; i<n; i++){
            sumOfArray += arr[i];
        }
        return sum-sumOfArray;
    }
    // optimal approach
    int missingNumber(int[] arr) {
        int n = arr.length;

        int xor1 = 0; // XOR of 1 to n+1
        int xor2 = 0; // XOR of array

        for(int i = 1; i <= n+1; i++) {
            xor1 ^= i;
        }

        for(int i = 0; i < n; i++) {
            xor2 ^= arr[i];
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        MissingNumber miss = new MissingNumber();
        int[] arr = {1 , 2, 4 , 5};
        System.out.println(miss.miss(arr));
        System.out.println(miss.miss2(arr));
        System.out.println(miss.missingNumber(arr));
    }
}