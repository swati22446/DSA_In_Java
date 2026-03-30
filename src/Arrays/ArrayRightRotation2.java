package Arrays;
import java.util.*;

public class ArrayRightRotation2 {
    public List<Integer> rightRotate2(int[] nums , int d){
        int n = nums.length;
        d = d % n;
        List<Integer> list = new ArrayList<>();
        reverse(nums,0,n-1);
        reverse(nums, 0,d-1);
        reverse(nums,d,n-1);
        for(int x : nums){
            list.add(x);
        }
        return list;
    }
    public void reverse(int[] arr, int start, int end){
        for(int i =start; i<=end ; i++){
            int temp = arr[end];
            arr[i] = arr[end-i];
            arr[end-i] = temp;
        }
    }
}
