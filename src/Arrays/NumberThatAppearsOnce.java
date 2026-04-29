package Arrays;

public class NumberThatAppearsOnce {
    int appearsOnce(int[] arr){
        int n = arr.length;
        int count;
        for(int i =0; i < n; i++){
            int num = arr[i];
            count = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count == 1) return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        NumberThatAppearsOnce num = new NumberThatAppearsOnce();
        int[] arr = {1 ,1 , 2, 3, 3, 4, 4};
        System.out.println(num.appearsOnce(arr));
    }
}
