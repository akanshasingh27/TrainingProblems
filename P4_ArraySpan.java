import java.util.Arrays;

public class P4_ArraySpan {
    static int span=0;
    static void span(int arr[],int n){
        Arrays.sort(arr);
        //the max element
        int max=arr[n-1];
        System.out.println("The largest Element is " + max);
        //the min element
        int min=arr[0];
        System.out.println("The smallest Element is " + min);
        //the span is
        span=max-min;
        System.out.println("The span is " + span);


    }
    public static void main(String[] args){
        int arr[]={34,90,76};
        int n=arr.length;
        span(arr,n);
     }
    
    
}
