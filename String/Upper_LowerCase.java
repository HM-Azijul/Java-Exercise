//Convert a String into UpperCase/LowerCase
import java.util.Scanner;

class Upper_LowerCase
{
    public static void main(String[] args)
    {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String to convert:");
        str=sc.nextLine();

        System.out.println("String in Upper case = "+str.toUpperCase());
        System.out.println("String in Lower case = "+str.toLowerCase());
    }
}

