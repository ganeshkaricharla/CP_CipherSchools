import java.util.*;

class BalancedParanthesis{
    static boolean checkBalancedParanthesis(String s){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char tmp=s.charAt(i);
            if(tmp=='[' || tmp=='{' || tmp=='(' || tmp=='<')
            {
                stack.push(tmp);
            }
            else if(stack.empty())
            {
                return false;
            }
            else if((tmp==']' && stack.peek()=='[') || (tmp==')' && stack.peek()=='(') || (tmp=='}' && stack.peek()=='{') || (tmp=='>' && stack.peek()=='<'))
            {
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="[()]{}{[()()]()}<>";
        System.out.print("is balanced: "+checkBalancedParanthesis(str));
    }
}