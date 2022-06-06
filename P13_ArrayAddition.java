public class P13_ArrayAddition {
    public static void main(String[] args) {
        int first[] = {9,1,8,9,2};
        int second[] =  {9,1,2,7};
        int n1 = first.length;
        int n2 = second.length;
        //define the length of new array 
        int n3 = n1 > n2 ? n1 : n2;
        int third[] = new int[n3];
        //send all pointers to the extream right
        int i = n1 - 1;
        int j = n2 - 1;
        int k = n3 - 1;
        int carry = 0;
        int sum = 0;
        //while solution is there
        while(k >= 0) {
            //when both arrays are defined
            if(i >= 0 && j >= 0) {
                sum = first[i] + second[j] + carry;
            }
            //when second array is not defined
            else if(i >= 0 && j < 0) {
                sum = first[i] + carry;
            }
            //when first array is not defined
            else if(j >= 0 && i < 0) {
                sum = second[j] + carry;
            }

            sum = sum % 10;
            carry = sum / 10;
            third[k] = sum;
            
            i--;
            j--;
            k--;
        }
        //if the left most addition has carry print it first
        if(carry != 0) {
            System.out.print(carry);
        }
        //print the sum
        for(int e : third) {
            System.out.print(e);
        }
        System.out.println();
    }
}
