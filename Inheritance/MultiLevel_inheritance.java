import java.util.Scanner;

class A
{
    int a;
    void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter No:");
        a=sc.nextInt();
    }
}

class B extends A
{
    int b;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter No:");
        b=sc.nextInt();
    }
}

class C extends B
{
    void add()
    {
        System.out.println("Addition = "+(a+b));
    }
}

class MultiLevel_inheritance
{
    public static void main(String[] args)
    {
        C aa=new C(); //create object of C class

        aa.input(); //class A Function-take input
        aa.getdata(); //class B Function-take input

        aa.add(); //class C Function-calculate
    }
}
