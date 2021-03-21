import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n,rev=0,z;
        System.out.println("Enter Number ");
        n=sc.nextInt();
        z=n; //store user input

        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }

        if(rev==z)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");

    }
}