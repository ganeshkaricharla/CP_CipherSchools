class FindFirstandLastIndex
{
    static int findFirstElement(int[] arr,int key)
    {
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(arr[mid] == key)
            {
                index = mid;
                right = mid - 1;
            }
            else if(arr[mid]<key)
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }

        return index;
    }
    static int findLastElement(int[] arr,int key)
    {
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left<=right)
        {
            int mid = (left + right)/2;
            if(arr[mid] == key)
            {
                index = mid;
                left = mid + 1;
            }
            else if(arr[mid]<key)
            {
                left = mid + 1;
            }
            else
            {
                right = mid -1;
            }
        }

        return index;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,5,5,5,5,6,6,7,8,8,9};
        int key = 8;
        int first = findFirstElement(arr,key);
        int last = findLastElement(arr,key);
        System.out.print(first+" "+ last);
    }
}