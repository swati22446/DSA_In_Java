package Arrays;

public class MissingNumber {
    // my approach
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

    public static void main(String[] args) {
        MissingNumber miss = new MissingNumber();
        int[] arr = {1 , 2, 4 , 5};
        System.out.println(miss.miss(arr));
    }
}