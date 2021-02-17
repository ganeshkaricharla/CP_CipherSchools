class countPathsInMatrix
{
    static int countPaths(int m,int n)
    {
        if(m==1 || n==1)
            return 1;
        else
            return countPaths(m-1,n)+countPaths(m,n-1);
    }
    public static void main(String[] args)
    {
        int m = 3;
        int n = 3;
        System.out.print(countPaths(m,n));
    }
}