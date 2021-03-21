import java.util.Scanner;

class Power_of_xy
{
    public static void main(String[] args)
    {
        int x,y,pro=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base: ");
        x=sc.nextInt();

        System.out.println("Enter Power:");
        y=sc.nextInt();


        while(y>0)
        {
            pro=pro*x;
            y--;
        }

        System.out.println("Value="+pro);

    }
}