
public class P15_OddElements {
    //X-OR Approach
    //if the elemnts are same it gives ans=0
    //if a unique value is there it gives that as answer
    static void xorapproach(int arr[],int n){
        int ans=0;
        for(int i=0;i<n;i++){

            ans=ans^arr[i];

        }
        System.out.print("Elements is :" + ans);

    }

    public static void main(String[] args){
        int arr[]={2,1,3,5,1,3,5};
        int n=arr.length;
        xorapproach(arr,n);

    }
}
