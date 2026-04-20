package Arrays;
import java.util.*;

public class RightRotateArrayByDPlaces {
    void rightRotate(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        int[] storage = new int[d];
        for(int i = n-d; i <n; i++){
            storage[i-(n-d)] = arr[i];
        }
        for(int i = n-d-1; i>=0; i--){
            arr[i+d] = arr[i];
        }
        for(int i=0; i<d ; i++){
            arr[i] = storage[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(storage));
    }
    void reverse(int[] arr, int beg , int end){
        for(int i = beg , j = end; i < j ; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    void rightRotate2(int[] arr, int d){
        int n = arr.length;
        reverse(arr,0 ,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        RightRotateArrayByDPlaces right = new RightRotateArrayByDPlaces();
        int[] arr = {1 ,2 , 3 ,4 , 5, 6 ,7};
//        right.rightRotate(arr, 10);
        right.rightRotate2(arr,5);
    }
}
