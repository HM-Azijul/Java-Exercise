import java.util.Scanner;

class Fibonacci_term
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int x=0,y=1, sum=0,n, term=1;
        System.out.println("Enter Max Value:");
        n=sc.nextInt();

        while(term<=n)
        {
            System.out.println(sum);
            x=y;
            y=sum;
            sum=x+y;
            term=term+1;
        }

    }
}