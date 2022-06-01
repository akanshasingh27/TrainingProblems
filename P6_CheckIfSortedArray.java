public class P6_CheckIfSortedArray {
    static void isSortedApproach(int arr[], int n) {
        for(int i = 1; i < n; i++) {
            //previous element is greater than current element
            if(arr[i-1] > arr[i]) {
                System.out.println("Array is not sorted...");
                return;
            }
        }
        System.out.println("Array is Sorted...");
    }

    public static void main(String[] args) {
        int arr[]={1,7,8,5,90};
        int n=arr.length;
        isSortedApproach(arr,n);
        
    }    
}
