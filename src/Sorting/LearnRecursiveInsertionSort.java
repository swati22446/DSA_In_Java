package Sorting;

public class LearnRecursiveInsertionSort {
    public int[] insertionSort(int[] nums){
        insertionSortHelper(nums, nums.length);
        return nums;
    }
    public void insertionSortHelper(int[] nums , int n){
        if(n<=1) {
            return;
        }

        insertionSortHelper(nums, n-1);
        int last = nums[n-1];
        int j = n-2;

        while(j>=0 && nums[j] > last){
            nums[j+1] =nums[j];
            j--;
        }
        nums[j+1] = last;
    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        LearnRecursiveInsertionSort recIns = new LearnRecursiveInsertionSort();
        int[] sortedArray = recIns.insertionSort(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }

}
