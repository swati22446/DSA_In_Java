package Arrays;
import java.util.*;

public class MoveZeroesToEnd {
    void moveZeroesToEnd(int[] arr){
        int n = arr.length;
        // no need to count since number of elements remain same
//        My first idea
       int i = 0;// Will keep the track of indexes where values are 0
       for(int j = 1; j < n; j++){
           if(arr[i] != 0){
               i++;
           }
           if(arr[j] != 0 && arr[i] == 0){
               swap(arr, i ,j);
           }
       }
        System.out.println(Arrays.toString(arr));
    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // The corrected one that won't cause overflow since i is moving independently in first one
    void moveZeroes(int[] arr){
        int n = arr.length;
        int j = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i; // prevents j from exceeding the value of n
                break;
            }
        }
        if(j== -1) return;

        for(int i = j+1; i < n; i++){
            if(arr[i] != 0){
                swap(arr, i,j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MoveZeroesToEnd move = new MoveZeroesToEnd();
        int[] arr ={1,0,2,3,2,0,0,4,5,1};
//        int[] arr = {1,2,3,4,5};
//        move.moveZeroesToEnd(arr);
        move.moveZeroes(arr);

    }
}
