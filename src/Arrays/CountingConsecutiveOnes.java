package Arrays;

public class CountingConsecutiveOnes {
    int count(int[] arr){
        int n = arr.length;
        int max = 0;
        int count =0;
        for(int i =0; i<n ; i++){
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else{
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        CountingConsecutiveOnes count = new CountingConsecutiveOnes();
        int[] arr = {1,1,1,1,1};
        int x = count.count(arr);
        System.out.println(x);
    }
}
