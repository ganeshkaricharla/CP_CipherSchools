class MajorityElement
{
    static int MajorityCandidate(int[] arr)
    {
        int majority = arr[0];
        int count = 0;
        for(int i = 0; i < arr.length; i = i + 1 )
        {
            if(majority==arr[i])
            {
                count +=1;
            }
            else
            {
                count -=1;
            }
            if(count==0)
            {
                majority =arr[i];
                count =1;
            }
        }
    return majority;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,1,2,1,3,1,3};
        int cand = MajorityCandidate(arr);
        int count = 0;
        for(int i = 0; i <arr.length; i=i+1)
        {
            if(arr[i]==cand)
            {
                count +=1;
            }
        }
        if(count > arr.length/2)
        {
            System.out.println(cand);
        }
        else
        {
            System.out.println("No Majority");
        }
    }
}