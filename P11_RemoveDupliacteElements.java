public class P11_RemoveDupliacteElements {
    static int removeDuplicate(int []arr, int n) {
        int j = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[j]) {
                //j gets iterated when new element is found in the array
                j++;
                //on the position of j place the new element discovered on i
                arr[j] = arr[i];
            }
        }
        //to return all the unique values till n
        return j+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5};
        int n = arr.length;
        int k = removeDuplicate(arr, n);
        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
