import java.util.Scanner;

class Even_odd
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);

System.out.println("Enter Number: ");
a=sc.nextInt();

if(a%2==0)
System.out.println("Even");
else
System.out.println("Odd");

//=======

if(a>0)
System.out.println("Positive");
else if(a<0)
System.out.println("Negative");
else
System.out.println("Zero");
}
}

