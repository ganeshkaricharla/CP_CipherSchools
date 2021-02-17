class Uniquepath{
    static int countPathsInMatrix(int m,int n)
    {
        if(m==1 || n==1)
            return 1;
        else
            return countPathsInMatrix(m-1,n)+countPathsInMatrix(m,n-1);
    }
    public static void main(String[] args)
    {
        System.out.print(countPathsInMatrix(3,2));
    }
}