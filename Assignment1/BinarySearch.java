class BinarySearch
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 8;
        int left = 0;
        int right = arr.length - 1;
        while(left<=right)
        {
            int mid = left +(right - left)/2;
            if(arr[mid] == key)
            {
                System.out.print(mid);
                break;
            }
            else if(arr[mid]< key)
            {
                left = mid + 1;
            }
            else if (arr[mid]>key)
            {
                right = mid - 1;
            }
        }

    }
}