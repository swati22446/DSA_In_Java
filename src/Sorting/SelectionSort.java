package Sorting;
import java.util.*;

public class SelectionSort {
    public void select(int[] num){
        int n = num.length;

        for(int i = 0; i <=n-2; i++){
            int mini = i;
            for(int j =i ; j<=n-1 ; j++){
                if(num[j] < num[mini]) mini =j;
            }
            int temp = num[i];
            num[i] = num[mini];
            num[mini] = temp;
        }
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        SelectionSort sel = new SelectionSort();
        sel.select(arr);
    }
}
