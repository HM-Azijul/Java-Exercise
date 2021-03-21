//Sum of Even & product odd digit

import java.util.Scanner;
class Even_odd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n, sum=0, product=1, digit;
        System.out.println("Enter Number:");
        n=sc.nextInt();

        while(n>0)
        {
            digit=n%10;

            if(digit%2==0)
                sum=sum+digit;

            else
                product=product*digit;

            n=n/10;
        }

        System.out.println("Sum="+sum+ " Product="+product);
    }
}