import java.util.Scanner;

class If_else
{
public static void main(String[] args)
{
int a,b,ch;
Scanner sc=new Scanner(System.in);

System.out.println("Enter First Number");
a=sc.nextInt();
System.out.println("Enter Second Number");
b=sc.nextInt();

System.out.println("Enter your Choice\n 1-> Add\n 2-> Subtract\n 3-> Multiply\n 4-> Divide");
ch=sc.nextInt();

if(ch==1)
System.out.println("Addition = "+(a+b));
else if(ch==2)
System.out.println("Subtraction = "+(a-b));
else if(ch==3)
System.out.println("Multiplication = "+(a*b));
else if(ch==4)
System.out.println("Division = "+(a/b));
else
System.out.println("Invalid Choice");
}
}

