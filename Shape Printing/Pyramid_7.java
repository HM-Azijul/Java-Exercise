import java.util.Scanner;
class Main
{
    public static  void main(String[] args)
    {
        int n,i,b,j; //n=5

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows:");
        n= sc.nextInt();

        //First Part
        for (i=1;i<=n;i++) //Coumt Of rows
        {
            for(b=1;b<=n-i;b++) //Space Prints
            {
                System.out.print(" ");
            }

            for (j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // Second Part
        n=n-1;
        for (i=1;i<=n;i++)
        {
            for (b=1;b<=i;b++)
            {
                System.out.print(" ");
            }

            for (j=1;j<=2*(n-i)+1;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
