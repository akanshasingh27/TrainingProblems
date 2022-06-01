import java.util.Arrays;

public class P2_SecondLargestElement {
    static void secondlargest(int arr[],int n){
        Arrays.sort(arr);
        int max=arr[n-2];
        System.out.println("The second largest Element is " + max);

    }
    public static void main(String[] args){
        int arr[]={34,90,76,89,45,67};
        int n=arr.length;
        secondlargest(arr,n);
     }
}
