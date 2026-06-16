package BinarySearch;

public class SearchX {
    int search(int[] nums,int target){
        int n = nums.length;
        int low =0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) low = mid + 1;
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchX sea = new SearchX();
        int [] arr = {-1 ,0,3,5,7,9};
        System.out.println(sea.search(arr,0));
    }
}
