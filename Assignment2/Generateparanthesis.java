import java.util.*;
class GenerateParanthesis{
    static void generate(int open,int close,int num,String currString)
    {
        if(currString.length() == 2*num ){
            System.out.println(currString)
            return;
        }
        if( open < n )
        {
            generateHelper(open+1,close,n,currString+"{",result);
        }
        if( close < open )
        {
            generateHelper(open,close+1,n,currString+"}",result);
        }
    }
    public static void main(String[] args)
    {
        int num =3;
        currString = "";
        open = 0;
        close = 0;
        generate(open,close,n,currString)
    }
}