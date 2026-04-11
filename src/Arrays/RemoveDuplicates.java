package Arrays;
import java.util.*;
public class RemoveDuplicates {
    // My approach --list approach
    void removeDuplicates(int[] nums){
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i =1; i<n ; i++){
            if(list.contains(nums[i])){

            }
            else{
                list.add(nums[i]);
            }

        }
        System.out.println(list);

    }

    //Second appraoch -- using set
    void removeDuplicates2(int[] arr){
        int n = arr.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i =0; i < n; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }


    public static void main(String[] args) {
        RemoveDuplicates rev = new RemoveDuplicates();
        int[] arr = {2, 3 ,2 , 4 , 1};
        rev.removeDuplicates(arr);
        rev.removeDuplicates2(arr);

    }
}
