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
        for(int i = d+1; i < n; i++){
            arr[i] = small[i - (d+1)];
        }
        System.out.println(Arrays.toString(arr));


    }

    public static void main(String[] args) {
        LeftRotateTheArrayByDPlaces left = new LeftRotateTheArrayByDPlaces();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        left.LeftRotation(nums, 3);
    }
}
