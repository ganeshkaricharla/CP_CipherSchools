class SearchInSortedMatrix
{
    public static void main(String[] args)
    {
        int arr[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        int key = 29;
        int i = 0;
        int j = arr.length -1 ;
        int n = arr.length;

        while(i <n && j >=0)
        {
            if(arr[i][j] == key)
            {
                System.out.println("["+i+","+j+"]");
                break;
            }
            else if(arr[i][j] > key)
            {
                j = j - 1;
            }
            else if(arr[i][j] < key)
            {
                i = i + 1;
            }
        }
        
    }
}