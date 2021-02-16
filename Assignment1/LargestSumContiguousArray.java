class LargestSumContiguousArray
{
    public static void main(String[] args)
    {
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxTillNow = Integer.MIN_VALUE;
        int maxEnd = 0;
        for(int i =0; i <arr.length; i=i+1)
        {
            maxEnd = maxEnd + arr[i];
            if(maxEnd < arr[i])
            {
                maxEnd = arr[i];
            }
            if(maxTillNow < maxEnd)  
            {
                maxTillNow = maxEnd;
            }
        }
        System.out.print(maxTillNow);
    }
}