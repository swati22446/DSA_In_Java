package Arrays;

public class CheckIfArrayIsSorted {
    boolean isSorted(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i < n-1; i++){
            if(nums[i] < nums[i+1]){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
