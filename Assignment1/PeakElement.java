class PeakElement
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,20,10,30,25};
        int n= arr.length;
        if(arr.length ==1)
        {
            System.out.print(arr[0]);   
        }
        else if(arr[0] > arr[1])
        {
            System.out.print(arr[0]);
        }
        else if(arr[n-1]> arr[n-2])
        {
            System.out.print(arr[n-1]);
        }
        for(int i = 1; i < n-1; i= i + 1)
        {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                System.out.print(i);
                System.out.print(" ");
                System.out.print(arr[i]);
                break;
            }
        }


    }
}