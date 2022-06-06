public class P25_PeakElement {
    public static void searchPeak(int nums[]){
        int low=0;
        int high=nums.length-1;
        int mid=(low+high)/2;

        while(low<=high){
            if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
       

    }
    
}
