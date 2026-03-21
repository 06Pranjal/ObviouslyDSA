package Arrays;

public class BuyAndSellStock {
    int profit(int[] prices) {
        int flag=0;
        int min=prices[0];
        for(int i =1; i < prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
                flag=i;
            }
        }
        int max=prices[flag];
        for(int i=flag+1;i<prices.length;i++){
            if(prices[i]>max){
                max=prices[i];
            }
        }
        return max-min;
    }

    public static void main(String[] args) {
        BuyAndSellStock obj = new BuyAndSellStock();
        System.out.println(obj.profit(new int[]{7,6,4,3,1}));
    }
}
