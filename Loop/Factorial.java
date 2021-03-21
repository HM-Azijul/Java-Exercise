import java.util.Scanner;

class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n,fac=1;
        System.out.println("Enter number to find Factorial:");
        n=sc.nextInt();

        while(n>0)
        //while(n>=1)
        {
            fac=fac*n;
            n=n-1;
        }

        System.out.println("Factorial= "+fac);
    }
}