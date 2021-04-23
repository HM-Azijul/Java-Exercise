import java.util.Scanner;

class compareTo_function
{
    public static void main(String[] args)
    {
        String str1;
        String str2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First String");
        str1=sc.nextLine();
        System.out.println("Enter Second String");
        str2=sc.nextLine();

        if (str1.compareTo(str2)==0)
            System.out.println("Equal String");
        else if(str1.compareTo(str2)>0)
            System.out.println("str1 is greater than str2");
        else
            System.out.println("str2 is greater than str1");
    }
}

