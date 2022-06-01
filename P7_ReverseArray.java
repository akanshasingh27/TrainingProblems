public class P7_ReverseArray {
   
    static void reverse(int arr[], int n) {
        int i = 0;
        int j = n-1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Array After Reverse...");
        for(int ele : arr) {
            System.out.print(ele+ ",");
        }
    }
    public static void main(String[] args) {
        int arr[]={7,8,4,9};
        int n=arr.length;
        reverse(arr,n);
        
    } 
}
