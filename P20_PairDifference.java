import java.util.Arrays;

public class P20_PairDifference {
    static int diff(int arr[], int n, int k) {
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        while(i < j ) {
            if((arr[j] - arr[i]) == k) {
                System.out.println("Pair is : " + arr[i] + "," + arr[j]);
                return 0;
            }
            else if(arr[j] - arr[i] < k) {
                i++;
            }
            else if(arr[j] - arr[i] > k) {
                j--;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int arr[]={2,20,0,3,5,4,6};
        int k= 5;
        diff(arr, arr.length,k);
    }
}
