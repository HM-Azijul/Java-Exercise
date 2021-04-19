import java.util.Scanner;

class Selection
{
    int []a=new int[10];

    void getData()
    {
        Scanner sc =new Scanner(System.in);
        int i;
        for (i=0; i<10; i++)
        {
            System.out.println("Enter No:");
            a[i]=sc.nextInt();
        }
    }

    void Sort()
    {
        int i,j;
        int temp;

        for (i=0; i<9; i++)
        {
            for (j=i+1; j<10;j++)
            {
                if (a[i] > a[j])
		{
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

    }

    void putData()
    {
        int i;
        for (i=0; i<10; i++)
            System.out.println(a[i]);
    }
}

class SelectionSort
{
    public static void main(String[] args)
    {
        Selection aa=new Selection();

        aa.getData();
        System.out.println("UnSorted Array : ");
        aa.putData();

        System.out.println("Sorted Array is : ");
        aa.Sort();
        aa.putData();
    }
}