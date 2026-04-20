package Arrays;

public class LinearSearch {
    int linearSearch(int[] arr , int e){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == e){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linear = new LinearSearch();
        int[] arr = {1, 2, 3, 4};
        System.out.println(linear.linearSearch(arr, 3));

    }
}
