import java.util.Scanner;

class Insertion
{
    int []a=new int[10];

    void getData() //take input
    {
        int i;
        Scanner sc= new Scanner(System.in);

        for (i=0; i<10; i++)
        {
            System.out.println("Enter No:");
            a[i]= sc.nextInt();
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
        int i, val, j;

        for (i=1; i<10; i++)
        {
            val=a[i];
            j=i-1;

            while (val<a[j])
            {
                a[j+1] = a[j];
                j--;

                if (j==-1)
                    break;
            }

            a[j+1] = val;
        }

    }

}

class InsertionSort
{
    public static void main(String[] args)
    {
        Insertion aa= new Insertion();

        aa.getData();
        System.out.println("Unsorted Array Is: ");
        aa.putData();

        aa.sort();
        System.out.println("Sorted Array : ");
        aa.putData();
    }
}

