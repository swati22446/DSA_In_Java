package Arrays;
import java.util.*;

public class ArrayRightRotation {
    public List<Integer> rightRotate(int[] nums , int d){
        int n = nums.length;
        d = d % n;
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<d; i++){
            int last = nums[n-1];
            for(int j = n-1; j>0; j--){

                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
        for(int x : nums){
            list.add(x);
        }
        return list;
    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        ArrayRightRotation array = new ArrayRightRotation();
        List<Integer> list1 = array.rightRotate(arr,2);
        System.out.println(list1);
    }
}
