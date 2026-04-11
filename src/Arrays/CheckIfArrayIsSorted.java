package Arrays;

public class CheckIfArrayIsSorted {
    boolean isSorted(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i < n-1; i++){
            if(nums[i] < nums[i+1]){

            }
            else {
                return false;
            }
        }
        return true;
    }

    boolean isSorted2(int[] nums){
        int n = nums.length;
        for(int i =1; i < n; i++){
            if(nums[i] > nums[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfArrayIsSorted sort = new CheckIfArrayIsSorted();
        int[] arr = {2 , 1 , 2 , 3};
        System.out.println(sort.isSorted(arr));
    }
}
