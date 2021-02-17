class Permutations
{
    static String swap(int i,int j,String s)
    {
        char[] temparray = s.toCharArray();
        char temp = temparray[i];
        temparray[i] = temparray[j];
        temparray[j] = temp;
        return String.valueOf(temparray);
    }

    static void permutations(int start,int end,String str){
        if(start>=end)
        {
            System.out.println(str)
            return;
        }
        else
        {
            for(int i = start; i <= end; i= i + 1)
            {
                str = swap(i,start,str);
                permutations(start+1,end,str,result);
                str = swap(i,start,str);
            }
        }
    }
    public static void main(String[] args)
    {
        String str="ABC";
        int start = 0;
        int end = str.length()-1;
        permutations(start,end,str)
    }

}