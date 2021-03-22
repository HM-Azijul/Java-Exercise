//Pyramid 1 Reverse

import java.util.Scanner;

class Pyramid_2
{
    public static  void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       System.out.println("Enter number of rows:");
       n= sc.nextInt();

       for (;n>=1;n--)
       {
           for (j=1;j<=n;j++)
           {
               System.out.print("* "); // here change: n,j,k,j+k
           }

           System.out.println();
       }
       
    }
}