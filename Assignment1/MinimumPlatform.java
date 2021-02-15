import java.util.Arrays;

class MinimumPlatform
{
    public static void main(String[] args)
    {
        int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
        int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
        Arrays.sort(dep);

        int i = 1;
        int j = 0;
        int maxPlatform = 1;
        int neededPlatform = 1;

        while(i < arr.length && j < dep.length)
        {
            if(arr[i] <= dep[j])
            {
                neededPlatform=neededPlatform + 1;
                i = i + 1;
            }
            else if (arr[i] > dep[j])
            {
                neededPlatform = neededPlatform - 1;
                j = j + 1;
            }

            if(neededPlatform > maxPlatform)
            {
                maxPlatform = neededPlatform;
            }

        }

        System.out.print(maxPlatform);

    }
}