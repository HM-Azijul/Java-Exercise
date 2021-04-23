import java.util.Scanner;

class PalindromeString
{
    public static void main(String[] args)
    {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to Check:");
        s=sc.nextLine(); //input: madam

        int i,j,flag;
        i=0;
        j=s.length()-1; //because length count from 1 but index start 0
        flag=0;

        while (i<j && flag==0)
        {
            if (s.charAt(i)!=s.charAt(j))
            {
                flag=1;
                break;
            }

            i=i+1;//i++
            j=j-1;//j--
        }

        if (flag==0)
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }
}

