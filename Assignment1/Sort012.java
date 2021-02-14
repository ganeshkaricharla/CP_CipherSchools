class Sort012
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,1,2,0,1,2,1,2,0,0,1,2,1,0};
        int left = 0;
        int mid = 0;
        int right  = arr.length - 1;
        while(mid<=right)
        {
            if(arr[mid] == 0)
            {
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left = left + 1;
                mid = mid + 1;
            }
            else if(arr[mid] == 1)
            {
                mid = mid + 1;
            }
            else if(arr[mid] == 2)
            {
                int temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right = right - 1;
            }
        }
        for(int i = 0; i<arr.length; i=i+1)
        {
            System.out.println(arr[i]);
        }
    }
}