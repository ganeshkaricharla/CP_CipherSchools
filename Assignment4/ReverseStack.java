import java.util.*;

class ReverseStack
{
    static Stack <Character> stack = new Stack<>();
    static void insertatBottom(char x)
    {
        if(stack.isEmpty())
        {
            stack.push(x); 
        }
        else
        { 

            char a = stack.peek(); 
            stack.pop(); 
            insertatBottom(x); 
            stack.push(a); 
        } 
    } 
    static void reverseStack()
    {
        if(stack.size()>0)
            {
                char temp = stack.peek();
                stack.pop();
                reverseStack();
                insertatBottom(temp);
            }
    }
    public static void main(String[] args)
    {
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        System.out.print(stack);
        reverseStack();
        System.out.print(stack);

    }
}