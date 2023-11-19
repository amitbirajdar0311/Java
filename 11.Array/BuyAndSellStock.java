public class BuyAndSellStock {
    public static void main(String[] args){
        int[] price = {7,1,5,3,6,4};


        int max_profit = 0;
        int bp = Integer.MAX_VALUE;

        // for(int i=0;i<price.length;i++){

        //     bp = Math.min(bp,price[i]);

        //     int profit = price[i] - bp;
        //     max_profit = Math.max(max_profit, profit);

        // }

        for(int i=0;i<price.length;i++){
            if(bp<price[i]){
                int profit = price[i] - bp;
                max_profit = Math.max(profit,max_profit);
            }

            else{
                bp = price[i];
            }
        }

        System.out.println("profit is " + max_profit);
    }
}


