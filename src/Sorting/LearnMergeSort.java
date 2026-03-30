package Sorting;
import java.util.*;

public class LearnMergeSort {
    public List<Integer> merge(int[] arr , int low, int mid, int high){
        List<Integer> list = new ArrayList<>();
        int left = low;
        int right = high;
        while(left<=mid && right<=high){
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left<= mid){
            list.add(arr[left]);
            left++;
        }
        while(right<= high){
            list.add(arr[right]);
            right++;
        }

        return list;

    }
    public void mergeSort(int[] arr, int low , int high){
        int mid =(low + high)/2;
        if(low >= high) return;

        mergeSort(arr , low ,mid);
        mergeSort(arr , mid , high);
        merge(arr, low, mid, high);

    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        LearnMergeSort mer = new LearnMergeSort();
        mer.mergeSort(arr,0,arr.length-1);
    }
}
