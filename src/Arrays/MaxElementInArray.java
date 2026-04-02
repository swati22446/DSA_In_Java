package Arrays;
import java.util.Arrays;

public class MaxElementInArray {
    int maxEle1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    int maxEle2(int[] arr){
        int largest = arr[0];
        for(int i =1; i < arr.length; i++){
            if (arr[i] > largest) largest = arr[i];
        }
        return largest;
    }

    public static void main(String[] args) {
        MaxElementInArray max = new MaxElementInArray();
        int[] arr = {4,6,1,2,5,9,0};
        System.out.println(max.maxEle1(arr));
        System.out.print(max.maxEle2(arr));
    }
}
