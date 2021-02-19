import java.util.*;
class SortStack{
    static void sortedInsert(Stack<Integer> s,int x){
        if(s.isEmpty() || s.peek()<x){
            s.push(x);
            return;
        }
        int tmp=s.pop();
        sortedInsert(s,x);
        s.push(tmp);
    }
    static void sortStack(Stack<Integer> s){
        if(!s.isEmpty()){
            int x=s.pop();
            sortStack(s);
            sortedInsert(s,x);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(15);
        s.push(5);
        s.push(20);
        s.push(7);
        sortStack(s);
        System.out.print(s);
    }
}