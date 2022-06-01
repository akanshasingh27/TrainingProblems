import java.util.Arrays;

public class P3_ThirdLargestElement {
    static void thirdlargest(int arr[],int n){
        Arrays.sort(arr);
        int max=arr[n-3];
        System.out.println("The third largest Element is " + max);

    }
    public static void main(String[] args){
        int arr[]={34,90,76,89,45,67};
        int n=arr.length;
        thirdlargest(arr,n);
     }
}
