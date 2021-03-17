import java.util.Scanner;

class Area
{
public static void main(String[] args)
{
int len, br, area, peri;
Scanner sc=new Scanner(System.in);

System.out.println("Enter Length:");
len=sc.nextInt();

System.out.println("Enter Breadth:");
br=sc.nextInt();

area=len*br;
peri=2*(len+br);
System.out.println("Area of Rectangle = "+area);
System.out.println("Perimeter of Reactangle = "+peri);
}
}