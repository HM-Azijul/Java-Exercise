import java.util.Scanner;

class Pyramid_3
{
    public static  void main(String[] args)
    {
        int n,i,s,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of rows");
        n= sc.nextInt();

        for (i=1;i<=n;i++)
        {
            for (s=1;s<=n-i;s++) //for print space
            {
                System.out.print(" ");
            }

            for (j=1;j<=i;j++)
            {
                System.out.print("*"); // here give j, i, i+j
            }

            System.out.println();
        }

    }
}
