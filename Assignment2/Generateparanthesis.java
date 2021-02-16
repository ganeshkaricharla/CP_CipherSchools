import java.util.*;
class GenerateParanthesis{
    static ArrayList<String> generate(int n){
        int open=0,close=0;
        String current_str="";
        ArrayList<String> result=new ArrayList<String>();
        generateHelper(open,close,n,current_str,result);
        return result;
    }
    static void generateHelper(int open,int close,int n,String current_str,ArrayList<String> result){
        if(current_str.length()==2*n){
            result.add(current_str);
            return;
        }
        if(open<n){
            generateHelper(open+1,close,n,current_str+"{",result);
        }
        if(close<open){
            generateHelper(open,close+1,n,current_str+"}",result);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> result=generate(3);
        for(String s:result){
            System.out.println(s);
        }
    }
}