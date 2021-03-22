//Pyramid 3 Reverse

import java.util.Scanner;

class Pyramid_4
{
    public static  void main(String[] args)
    {
        int n,i,b,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        n= sc.nextInt();

        for (i=1;i<=n;i++) // Count Number of rows
        {
            for (b=1;b<i;b++) //for blank space
            {
                System.out.print(" ");
            }

            for (j=1;j<=n+1-i;j++) //star printing
            {
                System.out.print("*"); // here change j,k(k=1), k(k=5)
            }

            System.out.println();
        }

    }
}