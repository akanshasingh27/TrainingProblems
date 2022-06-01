import java.util.Arrays;

public class P1_LargestElement {
    //sort the array and print the last element as the largest value
    static void approach(int arr[] , int n){
        Arrays.sort(arr);
        int max=arr[n-1];
        System.out.println("The largest Element is " + max);
        
    }

    public static void main(String[] args){
       int arr[]={34,90,76};
       int n=arr.length;
       approach(arr,n);
    }
}
