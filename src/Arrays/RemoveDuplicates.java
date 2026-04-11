package Arrays;
import java.util.*;
public class RemoveDuplicates {
    // My approach
    void removeDuplicates(int[] nums){
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i =0; i<n ; i++){
            if(list.contains(nums[i])){

            }
            else{
                list.add(nums[i]);
            }

        }
        System.out.println(list);

    }

    public static void main(String[] args) {
        RemoveDuplicates rev = new RemoveDuplicates();
        int[] arr = {2, 3 ,2 , 4 , 1};
        rev.removeDuplicates(arr);

    }
}
