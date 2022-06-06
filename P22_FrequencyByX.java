public class P22_FrequencyByX {
    static int countOccurrences(int arr[], int n, int x)
    {
        int freq = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              freq++;
        return freq;
    }
     
    public static void main(String args[])
    {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 };
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurrences(arr, n, x));
    }
}
