import java.util.Scanner;

class Bubble
{
    int []a =new int[10];

    void getData() //input
    {
        Scanner sc=new Scanner(System.in);
        int i;

        for (i=0; i<10; i++)
        {
            System.out.println("Enter No:");
            a[i]=sc.nextInt();
        }
    }

    void putData() //output
    {
        int i;
        for (i=0; i<10; i++)
            System.out.println(a[i]);
    }

    void sort()
    {
        int i,j,temp;

        for (i=0; i<10; i++)
        {
            for (j=0; j<9-i; j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
}

class BubbleSort
{
    public static void main(String[] args)
    {
        Bubble aa=new Bubble();

        aa.getData();
        System.out.println("Unsorted Array is: ");
        aa.putData();

        System.out.println("Sorted Array is: ");
        aa.sort();
        aa.putData();
    }
}

