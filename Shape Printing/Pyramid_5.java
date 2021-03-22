import java.util.Scanner;
class Pyramid_5
{
    public static  void main(String[] args)
    {
       int n,i,b,j;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number Of Rows:");
       n=sc.nextInt();

       for (i=1;i<=n;i++) //count Number of rows
       {
           for (b=1;b<=n-i; b++) //for blank space
           {
               System.out.print(" ");
           }

           for (j=1;j<=2*i-1;j++) //for star print
           {
               System.out.print(i); //change "*" ,j
           }

           System.out.println();
       }


    }
}

