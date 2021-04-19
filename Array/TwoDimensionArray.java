import java.util.Scanner;

class Array
{
    int [][]a = new int[3][3];

    void getData() //input
    {
        Scanner sc=new Scanner(System.in);
        int i,j;

        for(i=0; i<3; i++) //row
        {
            for (j=0; j<3; j++) //column
            {
                System.out.println("Enter Number:");
                a[i][j]= sc.nextInt();
            }
        }
    }

    void putData() //output
    {
        int i,j;

        for (i=0; i<3; i++)
        {
            for (j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"----");
            }
            System.out.println();
        }

    }

}

class TwoDimensionArray
{
    public static void main(String[] args)
    {
        Array aa=new Array();

        aa.getData();
        aa.putData();
    }
}

