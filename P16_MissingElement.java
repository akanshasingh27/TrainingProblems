public class P16_MissingElement {
    static void approach_2(int arr[], int n) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < n; i++) {
            x = x ^ arr[i];
        }
        for(int i = 0; i <= n; i++) {
            y = y ^ i;
        }
        int missing = x ^ y;
        System.out.println("Missing Number is : " + missing);
    }

    public static void main(String[] args) {
        // int arr[] = {1,2,3,5,6,7,8};
        int arr[] = {3,0,1};
        int n = arr.length;
        approach_2(arr, n);
    }
    
}
