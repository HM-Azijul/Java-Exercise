//Sum of Each Row or Column
import java.util.Scanner;

class RowSum
{
    int [][]a=new int[3][3];
    int i,j;

    void getData()
    {
        Scanner sc=new Scanner(System.in);

        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                System.out.println("Enter Number");
                a[i][j]= sc.nextInt();
            }
        }
    }

    void putData()
    {
        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
                System.out.print(a[i][j] + "---");
            System.out.println();
        }
    }

    void rowSum()
    {
        int sum;

        for (i=0; i<3; i++)
        {
            sum=0;
            for (j=0; j<3; j++)
            {
                sum=sum+a[i][j];
            }
            System.out.println("Sum of "+ i+1 +" Row = "+sum);
        }
    }

    void colSum()
    {
        int sum;

        for (i=0; i<3; i++)
        {
            sum=0;
            for (j=0; j<3; j++)
            {
                sum=sum+a[j][i];
            }
            System.out.println("Sum of "+ i+1 +" Column = "+sum);
        }
    }

}

class SumEachRow
{
    public static void main(String[] args) {
        RowSum aa = new RowSum();

        aa.getData();
        System.out.println("The Matrix is:");
        aa.putData();
        aa.rowSum();

        System.out.println();
        aa.colSum();
    }
}

