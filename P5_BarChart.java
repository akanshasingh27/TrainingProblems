public class P5_BarChart {
    public static void main(String[] args) {
        int arr[] = {3,1,0,7,5};
        int n = arr.length;
        int max = arr[0];
        //find the max element
        for(int ele : arr) {
            if(ele > max) {
                max = ele; //7
            }
        }

        // TC : O(n^2)
        //i=7
        for(int i = max; i >= 1; i--) {

            for(int j = 0; j < n; j++) {
                //comapre the elements
                //fill star if condition true
                if(i <= arr[j]) {
                    System.out.print("*\t");
                }
                else {
                    //space if false
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
