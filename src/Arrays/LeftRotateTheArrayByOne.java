package Arrays;
import java.util.Arrays;

public class LeftRotateTheArrayByOne {
    void leftRotateByOne(int[] arr){
        int n = arr.length;
        int j = arr[0];
        for(int i =1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = j;
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        LeftRotateTheArrayByOne rotate = new LeftRotateTheArrayByOne();
        int[] nums = {1, 2, 3, 4, 5};
        rotate.leftRotateByOne(nums);
    }
}
