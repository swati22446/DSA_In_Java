package Sorting;
import java.util.*;

public class InsertionSort {
    public void insert(int [] nums){
        int n = nums.length;

        for(int i =0; i<=n-1; i++){
            int j = i;
            while (j>0 && nums[j-1] > nums[j]){
                int temp =nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;

                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        InsertionSort ins = new InsertionSort();
        ins.insert(arr);
    }
}
