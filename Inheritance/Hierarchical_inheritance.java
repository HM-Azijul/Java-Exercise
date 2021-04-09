import java.util.Scanner;

class A
{
    int a,b;

    void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st Number:");
        a=sc.nextInt();
        System.out.println("Enter 2nd Number:");
        b=sc.nextInt();
    }
}

class B extends A
{
    void add()
    {
        System.out.println("Addition = "+(a+b));
    }
}

class C extends A
{
    void subtract()
    {
        System.out.println("Subtraction = "+(a-b));
    }
}

class Hierarchical_inheritance
{
    public static void main(String[] args)
    {
        B aa=new B();
        C bb=new C();

        aa.input();
        aa.add();

        bb.input();
        bb.subtract();
    }
}
