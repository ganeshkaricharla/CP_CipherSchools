import java.util.Arrays;
class AlternativeSorting
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,2,4,8,6,7,3,9};
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length -1;
        while(left < right)
        {
            System.out.print(arr[right]);
            System.out.print(" ");
            System.out.print(arr[left]);
            System.out.print(" ");
            left += 1;
            right -=1;
        }
    }
}