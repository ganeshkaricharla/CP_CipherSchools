class PrintSpiralMatrix
{
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4, 5, 6 },
                      { 7, 8, 9, 10, 11, 12 },
                      { 13, 14, 15, 16, 17, 18 } };
        
        int rs = 0;
        int cs =0;
        int re = arr.length-1;
        int ce = arr[0].length-1;

        while(rs <= re && cs <=ce)
        {
            for(int i = cs; i <= ce; i = i + 1)
            {
                System.out.print(arr[rs][i]);
                System.out.print(" ");
            }
            rs = rs + 1;
            for(int i = rs; i <= re; i = i + 1)
            {
                System.out.print(arr[i][ce]);
                System.out.print(" ");
            }
            ce = ce -1;
            if(rs<=re)
            {
                 for(int i =ce ;i >=cs; i = i-1)
                 {
                    System.out.print(arr[re][i]);
                    System.out.print(" "); 
                 }
                 re = re - 1;
            }
            if(cs<=ce)
            {
                 for(int i =re ;i >=rs; i = i-1)
                 {
                    System.out.print(arr[i][cs]);
                    System.out.print(" "); 
                 }
                 cs = cs + 1;
            }
        }
    }
}