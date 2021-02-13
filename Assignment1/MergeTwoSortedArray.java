class MergeTwoSortedArray
{
    public static void main(String[] args)
    {
        int[] arr1 = {1,3,5,7,9,11};
        int[] arr2 = {2,4,6,8};
        int[] arr3 = new int[arr1.length+arr2.length];
        int first = 0;
        int second = 0;
        int third =0;

        while(first<arr1.length && second <arr2.length)
        {
            System.out.println(first+second);
            if(arr1[first]<=arr2[second])
            {
                arr3[third] = arr1[first];
                third = third + 1;
                first = first + 1;
            }
            else
            {
                arr3[third] = arr2[second];
                third = third + 1;
                second = second + 1;
            }
        }

        while(first<arr1.length)
        {
            arr3[third] = arr1[first];
            first = first + 1;
            third = third + 1;
        }

        while(second<arr2.length)
        {
            arr3[third] = arr1[second];
            third = third + 1;
            second = second + 1;
            
        }

        for(int i =0;i<arr3.length;i=i+1)
        {
            System.out.print(arr3[i]);
        }
    }
}