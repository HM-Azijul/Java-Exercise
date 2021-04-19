//Addition, Subtraction of Matrix in Java
import java.util.Scanner;

class Addition
{
    int [][]a=new int[3][3];
    int [][]b=new int[3][3];
    int [][]c=new int[3][3];

    void getData() //input
    {
        Scanner sc=new Scanner(System.in);
        int i,j;

        for (i=0; i<3; i++) //matrix a input
        {
            for (j=0; j<3; j++)
            {
                System.out.println("Enter number of matrix a:");
                a[i][j]=sc.nextInt();
            }
        }

        for (i=0; i<3; i++) //matrix b input
        {
            for (j=0; j<3; j++)
            {
                System.out.println("Enter number of matrix b:");
                b[i][j]=sc.nextInt();
            }
        }
    }

    void add() //processing
    {
        int i,j;

        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    void putData() //output
    {
        int i,j;

        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"----");
            }
            System.out.println();
        }
    }
}

class AdditionMatrix
{
    public static void main(String[] args)
    {
        Addition aa=new Addition();

        aa.getData();
        aa.add();
        aa.putData();
    }
}

