package Sorting;
import java.util.*;

public class LearnRecursiveBubbleSort {
    public int[] bubbleSort(int[] nums){
         bubbleSortHelper(nums, nums.length);
         return nums;

    }
    public void bubbleSortHelper(int[] nums , int n){
        if(n<=1) {
            return;
        }


        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        bubbleSortHelper(nums, n-1);

    }


    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        LearnRecursiveBubbleSort recbub = new LearnRecursiveBubbleSort();
        int[] sortedArray = recbub.bubbleSort(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}
