import java.util.Scanner;

class SumOfArray 
{
    public static void main(String[] args) 
    {
        int size, i,sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        size=sc.nextInt();

        int []a = new int[size];

        for (i=0; i<size; i++)
        {
            System.out.println("Enter No:");
            a[i]= sc.nextInt();
        }

        for (i=0; i<size; i++)
        {
           sum=sum+a[i];
        }

        System.out.println("Sum = "+sum);
    }
}
