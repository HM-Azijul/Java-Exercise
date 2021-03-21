import java.util.Scanner;

class Reverse_number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n, rev=0;
        System.out.println("Enter No: you find Reverse:");
        n=sc.nextInt();

        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }

        System.out.println("Reverse = "+rev);
    }
}