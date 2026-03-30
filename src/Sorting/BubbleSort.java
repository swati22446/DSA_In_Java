package Sorting;
import java.util.Arrays;

public class BubbleSort {
    public void bubble(int[] num){
        int n = num.length;
        int didSwap = 0;
        for(int i = n-1 ; i>=1 ; i--){
            for(int j = 0; j<= i-1 ; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                    didSwap =1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int [] arr = {13 , 46 , 24 , 52 , 20 , 9};
        BubbleSort bub = new BubbleSort();
        bub.bubble(arr);
    }
}
