package Arrays;

public class SumOfElements {
    int sumOfEle(int[] nums){
        int sum = 0;
        for (int i = 0; i< nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfElements s = new SumOfElements();
        int[] arr = {1,2,3,4};
        int sum =s.sumOfEle(arr);
        System.out.println(sum);
    }
}
