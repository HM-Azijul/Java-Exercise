import java.util.Scanner;

class EqualsFunction
{
    public static void main(String[] args)
    {
        String str1=new String();
        String str2=new String();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String: ");
        str1=sc.nextLine();
        System.out.println("Enter Second String: ");
        str2=sc.nextLine();

        System.out.println("Case Sensitive Checking:");
        if (str1.equals(str2)) //.equals() - return true or false
            System.out.println("Equals String");
        else
            System.out.println("Not Equal String");


        System.out.println("Non Case Sensitive Checking:");
        if (str1.equalsIgnoreCase(str2)) //.equalsIgnoreCase()
            System.out.println("Equals String");
        else
            System.out.println("Not Equal String");

    }
}

