import java.util.*;
class NextSmallerElement
{
    static void nextSmallerElement(int[] arr)
    {
        Stack <Integer> stack = new Stack<>();
        for(int i = arr.length-1; i >= 0 ;i = i - 1)
        {

            while(!stack.isEmpty() && stack.peek() > arr[i])
            {
                System.out.println(stack.peek() + "   --> " + arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
        }
        //stack.push(arr[0]);
        if(stack.isEmpty())
        {
            return;
        }
        else
        {
            for(int i:stack)
            {
                System.out.println(i + "   -->" + "No Smaller Element");
            }
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {1,3,0,8,5};
        nextSmallerElement(arr);
    }
}