import java.util.*;
class NextGreaterElement
{
    static void nextGreaterElement(int[] arr)
    {
        Stack <Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length;i = i + 1)
        {

            while(!stack.isEmpty() && stack.peek()<arr[i])
            {
                System.out.println(stack.peek() + "   --> " + arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
        }
        if(stack.isEmpty())
        {
            return;
        }
        else
        {
            for(int i:stack)
            {
                System.out.println(i + "   -->" + "No Greater Element");
            }
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {4,5,2,25};
        nextGreaterElement(arr);

    }
}