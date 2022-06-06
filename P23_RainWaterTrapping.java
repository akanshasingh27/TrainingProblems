public class P23_RainWaterTrapping {
    public static void main(String[] args) {
        int pillars[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = pillars.length;
        //base case
        if(n == 0) {
            System.out.println("No Pillars Exists...");
            return;
        }
        //find the prefix from front
        int pMax[] = new int[n];    // Prefix Max
        //find the suffux from back
        int sMax[] = new int[n];    // Suffix Max
        //must do
        pMax[0] = pillars[0];   // storing 0th index element in prefix max
        sMax[n-1] = pillars[n-1];   // storing last index element in suffix max

        //formula for pmax
        for(int i = 1; i < n; i++) {
            pMax[i] = Math.max(pMax[i-1], pillars[i]);
        }
        //formula for smax

        for(int i = n-2; i >= 0; i--) {
            sMax[i] = Math.max(sMax[i+1], pillars[i]);
        }

        int amountOfWater = 0;
        for(int i = 0; i < n; i++) {
            //input value
            int currentPillar = pillars[i];
            //let
            int h1 = pMax[i];
            int h2 = sMax[i];
            //take the minimum value out of both the hieghts
            int decidingHeight = Math.min(h1, h2);
            //determine the amount of water
            if(decidingHeight > currentPillar) {
                amountOfWater += decidingHeight - currentPillar;
            }
        }

        System.out.println("Amount of Water is : " + amountOfWater);



    }
}
