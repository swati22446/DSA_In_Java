package Arrays;
import java.util.*;

public class IntersectionOfTwoArrays {
    //using brute force
    void intersection(int[] arr , int[] nums){
        int n = arr.length;
        int m = nums.length;
        boolean[] vis = new boolean[m];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i] == nums[j] && vis[j] == false){
                    list.add(arr[i]);
                    vis[j] = true;
                    break; // Will only terminate the innermost loop within which it exists.
                }
                if (nums[j] > arr[i]){
                    break;
                }
            }
        }
        System.out.println(list);
    }
    // using optimal solution
    void intersection2(int[] arr, int[] nums){
        int n = arr.length;
        int m = nums.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList();
        while(i < n && j < m){
            if(arr[i] < nums[j]){
                i++;
            }
            else if(nums[j] < arr[i]){
                j++;
            }
            else{
                list.add(arr[i]);
                i++;
                j++;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays inter = new IntersectionOfTwoArrays();
        int[] arr1 = {1,2,2,3,4,5};
        int[] arr2 = {2,3,3,4,5,7,8};
        inter.intersection(arr1, arr2);
        inter.intersection2(arr1 ,arr2);
    }
}