import java.util.Scanner;

class TwoPeopleMeetEachOther
{ 
    static boolean WillMeet(int x1,int v1,int x2,int v2)
    {
        if(x1 > x2 && v1 >= v2)
        {
            return false;
        }
        else if(x2 > x1 && v2 >= v1)
        {
            return false;
        }

        return ((Math.abs(x1-x2)%Math.abs(v1-v2))==0);

    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x1=input.nextInt();
        int v1=input.nextInt();
        int x2=input.nextInt();
        int v2=input.nextInt();
        if (WillMeet(x1,v1,x2,v2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}