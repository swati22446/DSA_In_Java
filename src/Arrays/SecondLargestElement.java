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
    int seconfLar2(int[] nums){
        int largest = nums[0];
        for(int i =0; i< nums.length; i++){
            if(nums[i]> largest){
                largest = nums[i];
            }
        }
        int secondLar = -1;
        for(int i =0; i< nums.length; i++){
            if(nums[i] > secondLar && nums[i]<largest){
                secondLar = nums[i];
            }
        }
        return secondLar;
    }

    public static void main(String[] args) {
        SecondLargestElement sec = new SecondLargestElement();
        int[] nums = { 7,3,4,2,1,7,7,2,0};
        System.out.println(sec.secondLar1(nums));
        System.out.println(sec.seconfLar2(nums));
    }
}
