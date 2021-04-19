import java.util.Scanner;

class Array_1
{
    public static void main(String[] args)
    {
        int[] a=new int[10]; //int a[]=new int[10];

        Scanner sc=new Scanner(System.in);

        for (int i=0; i<10; i++) // Input of Array
        {
            System.out.println("Enter No: ");
            a[i]=sc.nextInt();
        }

        for (int i=0; i<10; i++) // Display of Array which we take input
        {
            System.out.println(a[i]);
        }

    }
}