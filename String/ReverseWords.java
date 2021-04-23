//I Eat Rice - Rice Eat I
import java.util.Scanner;

class ReverseWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name=new String();

        System.out.println("Enter String:");
        name=sc.nextLine();
        int i,j,k;
        k=0;
        i=name.length()-1;

        while (i>=0)
        {
            j=i;
            while (name.charAt(j)!=' ' && j>0)
                j--;

            if (j==0)
                k=0;
            else
                k=j+1;

            while (k<=i)
            {
                System.out.print(name.charAt(k)); //print
                k++;
            }

            System.out.print(" "); // blank space after word
            i=j-1;
        }

    }
}

