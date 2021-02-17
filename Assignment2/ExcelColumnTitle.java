class ExcelColumnTitle
{
    static void columnTitle(int num,String str)
    {
        char c = 'a';
        if(num <=26)
        {
            c = (char)(num + 64);
            str = str + c;
            for(int i = str.length()-1; i >=0; i = i - 1)
            {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
            return;
        }
        else
        {
            int temp = num % 26;
            if(temp == 0)
            {
                temp = 26;
                num = (num/26) - 1;
            }
            else
            {
                num = num/26;
            }
            c = (char)( temp + 64 );
            str = str + c;
            columnTitle(num,str);
        } 
    }

    public static void main(String[] args)
    {
        int num = 702;
        String str = "";
    }
}