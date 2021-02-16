class SearchInSortedArray
{
    static int search(int[] arr,int left,int right,int key)
    {
        if(left > right)
        {
            return -1;
        }

        int mid = left + (right-left)/2;
        if(arr[mid] == key)
        {
            return mid;
        }
        
        if(arr[left]<=arr[mid])
        {
            if(arr[left]<=key && arr[mid]>key)
            {
                return search(arr,left,mid-1,key);
            }
            else
            {
                return search(arr,mid+1,right,key);
            }
        }
        else 
        {
            if(arr[mid] <= key && arr[right] >=key)
            {
                return search(arr,mid+1,right,key);
            }
            else
            {
                return search(arr,left,mid-1,key);
            }
        }




    }
    public static void main(String[] args)
    {
        int[] arr ={4,5,6,7,8,9,1,2,3};
        int left = 0;
        int right = arr.length -1;
        int key = 2;
        System.out.println(search(arr,left,right,key));
        }
}