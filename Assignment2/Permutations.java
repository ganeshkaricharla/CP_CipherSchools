import java.util.*;
class Permutations{
    static String swap(int i,int j,String s){
        char[] temparray=s.toCharArray();
        char t=temparray[i];
        temparray[i]=temparray[j];
        temparray[j]=t;
        return String.valueOf(temparray);
    }
    static ArrayList<String> permutationsOfStr(String s){
        int start=0,end=s.length()-1;
        ArrayList<String> result=new ArrayList<String>();
        permutationsofstrhelper(start,end,s,result);
        return result;
    }
    static void permutationsofstrhelper(int start,int end,String s,ArrayList<String> result){
        if(start>=end){
            result.add(s);
            return;
        }else{
            for(int i=start;i<=end;i++){
                s=swap(i,start,s);
                permutationsofstrhelper(start+1,end,s,result);
                s=swap(start,i,s);
            }
        }
    }
    public static void main(String[] args) {
        String s="ABC";
        ArrayList<String> result=permutationsOfStr(s);
        for(String st:result){
            System.out.println(st);
        }
    }
}