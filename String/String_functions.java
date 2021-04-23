//sub string(n); sub String(n,m); concat(); indexOf('X'); indexOf('X', n);
import java.util.Scanner;

class String_functions 
{
    public static void main(String[] args)
    {
        String str1=new String();
        String str2=new String();
        String str3=new String();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String:"); //Azijul is going to market.
        str1=sc.nextLine();
        System.out.println("Enter Second String:"); //Buy Some Vegetable
        str2=sc.nextLine();

        System.out.println(str1.substring(5));
        System.out.println(str1.substring(6,10));

        str3=str1.concat(str2);
        System.out.println(str3);

        System.out.println(str1.indexOf('y'));
        System.out.println(str1.indexOf('y',2));
    }
}

