class LargestSumContiguousArray
{
    public static void main(String[] args)
    {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxTillNow = Integer.MIN_VALUE;
        int maxEnd = 0;
        for(int i =0; i <arr.length; i=i+1)
        {
            System.out.println("T:"+maxTillNow + "S:"+maxEnd);
           maxEnd = maxEnd + arr[i];
           if(maxTillNow < maxEnd)
           {
               maxTillNow = maxEnd;
           }
           if(maxEnd < 0)
           {
               maxEnd = 0;
           }
        }
        System.out.print(maxTillNow);
    }
}