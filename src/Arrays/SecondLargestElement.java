package Arrays;
import java.util.Arrays;

public class SecondLargestElement {
    int secondLar1(int[] arr){
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int i = arr.length -2;
        int secondLar = arr[i];

        while(i>=0){
            if(secondLar == largest){
                i--;
                secondLar =  arr[i];
            }
            else if(secondLar != largest){
                break;
            }

        }
        return secondLar;
    }

    public static void main(String[] args) {
        SecondLargestElement sec = new SecondLargestElement();
        int[] nums = { 7,3,4,2,1,7,7,2,0};
        System.out.println(sec.secondLar1(nums));
    }
}
