class SegregationOf0and1
{
    public static void main(String[] args)
    {
        int[] arr = {0,0,0,1,0,1,0,1,1,0,1,0};
        int left = 0;
        int right = arr.length-1;

        while(left<right)
        {
            while(left<right && arr[left]==0)
            {
                left = left + 1;
            }
            while(left<right && arr[right]==1)
            {
                right = right - 1;
            }

            if(left < right)
            {
                arr[left] = 0;
                arr[right] = 1;
                left = left + 1;
                right = right - 1;            
            }
        }
        for(int i = 0;i<arr.length;i=i+1)
        {
            System.out.println(arr[i]);
        }
    }
}