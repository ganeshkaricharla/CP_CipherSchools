import java.io.*; 
class personsmeet
{ 
    static boolean meet(int x1,int x2,int v1,int v2){
        if(x1<x2 && v1<=v2){
            return false;
        }
        if(x2<x1 && v2<=v1){
            return false;
        }
        if(x1>=x2){
            while(x1>=x2){
                if(x1==x2)
                    return true;
                x1=x1+v1;
                x2=x2+v2;
            }
        }else{
            while(x2>=x1){
                if(x1==x2)
                    return true;
                x1=x1+v1;
                x2=x2+v2;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int x1=5,x2=4,v1=8,v2=7;
        if(meet(x1,x2,v1,v2))
            System.out.println("Meet");
        else
            System.out.println("don't meet");
    }
} 