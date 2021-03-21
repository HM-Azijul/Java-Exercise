import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int x=0,y=1, sum=0,n;
        System.out.println("Enter Max Value:");
        n=sc.nextInt();

        while(sum<=n)
        {
            System.out.println(sum);
            x=y;
            y=sum;
            sum=x+y;
        }

    }
}