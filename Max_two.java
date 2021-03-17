import java.util.Scanner;

class Max_two
{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);

System.out.println("Enter First Number:");
a = sc.nextInt();

System.out.println("Enter Second Number:");
b = sc.nextInt();

if(a>b)
System.out.println("Max Number = "+a);
else
System.out.println("Max Number = "+b);
}
}