public class P17_ZeroOneSort {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,0,0,1,0,0,1};
        int count = 0;
        for(int e : arr) {
            if(e == 0) {
                //variable for when element is 0
                count++;
            }
        }
        for(int i = 0; i < count; i++) {
            //upto count fill with 0
            arr[i] = 0;
        }
        for(int i = count; i < arr.length; i++) {
            //till the rest of the length fill 1
            arr[i] = 1;
        }

        for(int e : arr){
            System.out.print(e+ ",");
        }


    }
    
}
