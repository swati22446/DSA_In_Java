package Arrays;
import java.util.*;

public class UnionOfTwoSortedArrays {
    void union(int[] nums, int[] arr){
        int n = nums.length;
        int m = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i< n ; i++){
            set.add(nums[i]);
        }
        for(int i =0 ; i < m; i++){
            set.add(arr[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }
    List<Integer> union2(int[] arr, int[] nums){
        int n = arr.length;
        int m = nums.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while(i < n && j < m){
            if(arr[i] <= nums[j]){
                if(list.size() == 0 || !list.contains(arr[i])){
                    list.add(arr[i]);

                }
                i++;
            }
            else{
                if(list.size() == 0 || !list.contains(nums[j])){
                    list.add(nums[j]);
                }
                j++;
            }
        }
        while(i < n){
            if(list.size() == 0 || !list.contains(arr[i])){
                list.add(arr[i]);

            }
            i++;
        }
        while(j < m){
            if(list.size() == 0 || !list.contains(nums[j])){
                list.add(nums[j]);
            }
            j++;
        }
        return list;
    }
    public static void main(String[] args) {
        UnionOfTwoSortedArrays union = new UnionOfTwoSortedArrays();
        int[] num1 = {1 , 1 , 2 , 3 , 4 , 5};
        int[] num2 ={2 , 3, 4 , 4, 5 , 6};
        union.union(num1,num2);
        System.out.println(union.union2(num1,num2));
    }
}
