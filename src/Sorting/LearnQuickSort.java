package Sorting;

import java.util.Arrays;

public class LearnQuickSort {
    public void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pindex = pivotIndex(arr,low,high);
            quickSort(arr, low, pindex-1);
            quickSort(arr, pindex+1, high);
        }

    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int pivotIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while( i< j){
            while(arr[i] <= pivot && i<=high-1){
                i++;
            }
            while(arr[j] >= pivot && j >= low+1){
                j--;
            }
            if(i < j) swap(arr, i , j);
        }
        swap(arr, low , j);
        return j;
    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        LearnQuickSort qui = new LearnQuickSort();
        qui.quickSort(arr, 0 , arr.length-1);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

}
