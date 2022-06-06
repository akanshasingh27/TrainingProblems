public class P14_SubtractionArray {
    static void subtract(int arr1[],int arr2[],int m,int n){
        int carry=0;
        int result[]= new int[m]; //m is the lenght of first array
        //from the back of the array
        for(int i=(m-1);i>=0;i--){
            //if i<j
            if((arr1[i]+carry)<arr2[i]){
                result[i]=arr1[i]+carry+10-arr2[i];
                carry=-1;
            }
            else{
                result[i]=arr1[i]+carry-arr2[i];
                carry=0;
            }
        }
        //print the result
        for(int i=0;i<m;i++)
            System.out.print(result[i]+" ");
    }
    public static void main(String[] args){
        int arr1[]={3,1,7,3};
        int arr2[]={2,1,7,8};
        subtract(arr1,arr2,arr1.length,arr2.length);
    }
}
