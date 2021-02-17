class LastNonZeroDigit
{
    static int dig[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};

    static int lastNon0Digit(int num)
    {
        if(num<10)
            return dig[num];

        if (((num / 10) % 10) % 2 == 0) 
            return (6 * lastNon0Digit(num / 5) * dig[num % 10]) % 10; 
        else
            return (4 * lastNon0Digit(num / 5) * dig[num % 10]) % 10; 
    }

    public static void main(String[] args)
    {
        System.out.print(lastNon0Digit(5));
    }
}