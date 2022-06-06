public class P18_RunningSum {
    public static int[] runningSum(int[] nums) {
        //create new array with same size as original array
        int []result = new int[nums.length];
        //fix position for both at 0
        result[0] = nums[0];
        //run loop
        for(int i = 1; i < nums.length; i++) {
            //add previous value in result with new element in array
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        runningSum(nums);
    }
}
