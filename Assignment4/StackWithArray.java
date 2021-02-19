public class StackWithArray{
    int[] stack;
    int capacity;
    StackWithArray(int size)
    {
        stack=new int[size];
        capacity=size;
    }
    StackWithArray(){
        stack=new int[5];
        capacity=5;
    }
    int top=0;
    public int size(){
        return top;
    }
    public void push(int num){
        if(top>=capacity){
            System.out.println("Capacity exceeded");
        }
        else{
            stack[top]=num;
            top++;
        }
    }
    public void show(){
        for(int n:stack){
            System.out.print(n+ "  ");
        }
        System.out.println();
    }
    public void pop(){
        if(top<0){
            System.out.print("Stack is empty");
        }
        else{
            top--;
            stack[top]=0;
        }
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public int peek(){
        if(top<=0){
            System.out.print("stack is empty");
            return -1;
        }
        else{
            return stack[top-1];
        }
    }
}