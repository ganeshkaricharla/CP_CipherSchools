class FindMissingNumber
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,6,5,7,8,9};
        int n = arr.length;
        int sum = (n+1)*(n+2)/2;
        for(int i =0; i < n; i = i+1)
        {
            sum = sum - arr[i];
        }
        System.out.println(sum);
    }
}