import java.util.Scanner;

class Scanner
{
public static void main(String [] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);

System.out.println("Enter First Number:");
a=sc.nextInt();

System.out.println("Enter Second Number:");
b=sc.nextInt();

c=a+b;
System.out.println("Addition : "+c);

}
}