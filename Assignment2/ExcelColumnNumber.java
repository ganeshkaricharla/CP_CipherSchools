class ExcelColumnNumber
{
    static void ColumnNumber(String str,int num,int start,int end)
    {
        if(start>end)
        {
            System.out.println(num);
        }
        else
        {
            int temp = 1;
            int chr = (str.charAt(start) -64);
            temp = temp *chr;
            for(int i = start; i <end; i = i + 1)
            {
                temp = temp*26;
            }
            num = num + temp;
            ColumnNumber(str,num,start+1,end);
        }
    }

    public static void main(String[] args)
    {
        String str = "A";
        int num = 0;
        int start = 0;
        int end = str.length() -1;
        ColumnNumber(str,num,start,end);
    }
}