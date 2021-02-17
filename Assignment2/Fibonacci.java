class Fibonacci{
    
    static int fibonacci(int num)
    {
        if(num == 0 || num == 1)
            return num;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        System.out.print(fibonacci(9));
    }
}
