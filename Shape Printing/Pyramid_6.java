//Pyramid 5 Reverse

import java.util.Scanner;
class Main
{
    public static  void main(String[] args)
    {
        int n,i,b,j;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Rows");
        n= sc.nextInt();

        for (i=1;i<=n;i++) //rows printing
        {
            for (b=1;b<i;b++) //blank space printing
            {
                System.out.print(" ");
            }

            for (j=1; j<=2*(n-i)+1; j++)//star printing
            {
                System.out.print("*"); //j, i, (n-i+1)
            }

            System.out.println();
        }

    }
}