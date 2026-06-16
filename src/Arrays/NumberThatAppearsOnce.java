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
    int appearsOnce2(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int[] hash = new int[largest +1];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }
        for(int i =0; i<largest + 1; i++){
            if(hash[i] == 1) return i;
        }
        return -1;
    }
    public int singleNumber(int[] nums){
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        NumberThatAppearsOnce num = new NumberThatAppearsOnce();
        int[] arr = {4,1,2,1,2};
        System.out.println(num.appearsOnce(arr));
        System.out.println(num.appearsOnce2(arr));
        System.out.println(num.singleNumber(arr));
    }
}
