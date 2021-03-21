//Sod = Sum of digit
import java.util.Scanner;

class Sod
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n, sum=0;
        System.out.println("Enter Number:");
        n=sc.nextInt();

        while(n>0)
        {
            sun= sum + n % 10;
            n=n/10;
        }

        System.out.println("Sum of digit ="+sum);
    }
}