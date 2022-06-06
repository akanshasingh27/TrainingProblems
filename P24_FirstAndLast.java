public class P24_FirstAndLast {
    public static int[]  searchRange(int[] nums,int target){
        int start=findFirstOccurence(nums,target);
        int end=findSecondOccurence(nums,target);

        int result[]=new int[2];
        result[0]=start;
        result[1]=end;
        return result;

       
        }
        

   public static int findFirstOccurence(int [] nums , int k){
        int low=0;
        int high=nums.length-1;
        int index=-1;

        int mid=(low+high)/2;
        while(low<=high){
            if(nums[mid]==k){
                index=mid;
                high=mid+1;
            }
            else if(nums[mid]<k){
                high=mid+1;
            }
            else{
                low=mid-1;
            }
        }
        return index;
    }

    public static int findSecondOccurence(int [] nums , int k){
        int low=0;
        int high=nums.length-1;
        int index=-1;

        int mid=(low+high)/2;
        while(low<=high){
            if(nums[mid]==k){
                index=mid;
                low=mid+1;
            }
            else if(nums[mid]<k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return index;
    }
}
