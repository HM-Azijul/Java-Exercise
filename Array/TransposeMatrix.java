import java.util.Scanner;

class xyz
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
                System.out.println("Enter Number:");
                a[i][j] = sc.nextInt();
            }
        }
    }

    void putData()
    {
        for (i=0; i<3;i++)
        {
            for (j=0; j<3; j++)
                System.out.println(a[i][j] + "---");
        }
    }

    void transpose()
    {
        System.out.println("Transpose is:");

        for (i=0; i<3; i++)
        {
            for (j=0; j<3; j++)
            {
                //method-1:
                System.out.print(a[i][j]+ "---"); // just change i,j(row*col) to j,i(col*row)

                //method-2:
                //b[i][j] = a[j][i]; //declare new matrix b
            }
            System.out.println();
        }
    }

}

class TransposeMatrix
{
    public static void main(String[] args) {
        xyz aa =new xyz();

        aa.getData();
        System.out.println("Orginal Matrix");
        aa.putData();
        aa.transpose();
    }
}

