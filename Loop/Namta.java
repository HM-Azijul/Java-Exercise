import java.util.Scanner;

class Namta
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int i,j=1;
        System.out.println("Enter No. to Print Table:");
        i=sc.nextInt();

        while(j<=10)
        {
            System.out.println(i*j);
            j=j+1;
        }
    }
}