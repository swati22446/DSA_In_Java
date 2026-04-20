package Arrays;
import java.util.Arrays;

public class LeftRotateTheArrayByDPlaces {
    //brute force
    void LeftRotation(int[] arr, int d){
        int n = arr.length;
        d = d % n;
        int[] small = new int[d];
        for(int i = 0; i < d; i++){
            small[i] = arr[i];
        }
        for(int i = d ; i < n; i++){
            arr[i-d] = arr[i];
        }
        for(int i = n-d; i < n; i++){
            arr[i] = small[i - (n -d)];
        }
        System.out.println(Arrays.toString(arr));


    }
    // Optimal approach
    void LeftRotate2(int[] arr ,  int d){
        int n = arr.length;
        d = d % n;
        reverse(arr,0, n-1);
        reverse(arr, 0,n-d-1);
        reverse(arr, n-d, n);


        System.out.println(Arrays.toString(arr));


    }
    void reverse(int[] arr , int beg , int end){
        for(int i= end, j = beg; i > j; i--, j++ ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
//        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        LeftRotateTheArrayByDPlaces left = new LeftRotateTheArrayByDPlaces();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        left.LeftRotation(nums, 5); // You can put any value according to your choice
//        left.LeftRotate2(nums,5);
//        left.reverse(nums,0,nums.length);
        left.LeftRotate2(nums,5);

    }
}
