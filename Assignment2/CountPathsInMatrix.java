class countPathsInMatrix{
    static int countPaths(int m,int n){
        if(m==1 || n==1)
            return 1;
        else
            return countPaths(m-1,n)+countPaths(m,n-1);
    }
    public static void main(String[] args) {
        System.out.print(countPaths(3,3));
    }
}