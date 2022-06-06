public class P21_StockBuyandSell {
    static void approach_3(int arr[]) {
        int result[]=new int[arr.length];
        //let the index element be minimum
        int min = arr[0];
        int finalProfit = 0;
        int profit = 0;
        //a for loop to run through the array
        for(int i = 1; i < arr.length; i++) {
            //to find the fp subtract the elements of array with min
            finalProfit = arr[i] - min;
            //to find the maximum profit
            profit = Math.max(profit, finalProfit);
            result[i] = profit;
            //update the min value when a new minimum element is found out from the array
            min = Math.min(min, arr[i]);
        }
             System. out. print("The max profit is " + result[profit]);
        }
    


        public static void main(String[] args) {
            int arr[] = {7,1,5,3,6,4};
            approach_3(arr);
            }
        

        }
