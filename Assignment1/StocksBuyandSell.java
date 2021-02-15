class StocksBuyandSell
{
    public static void main(String[] args)
    {
        int[] arr = {100,180,260,310,40,535,695};
        int profit = 0;
        int maxVal = arr[0];
        for(int i =1; i < arr.length; i = i + 1)
        {
            if(arr[i]>=maxVal)
            {
                int tempProfit = arr[i] - maxVal;
                profit = Math.max(profit,tempProfit);
            }
            else if(arr[i]<maxVal)
            {
                maxVal = arr[i];
            }
        }

        System.out.println(profit);
        
    }
}