public class P9_RotateOnce {
    static void rotateOnceP2(int arr[], int n) {
        int i = 0;
        int j = n-1;
        int temp;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        for(int ele:arr){
            System.out.print(ele + ",");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        // rotateOnce(arr, n);
        rotateOnceP2(arr, n);
    } 
    
}
