import java.util.Scanner;

class A
{
    int a,b;

    void input()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number");
        a=sc.nextInt();

        System.out.println("Enter Second Number");
        b=sc.nextInt();
    }

    void add()
    {
        System.out.println("Addition="+(a+b));
    }
}

class B extends A
{
    int c;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No:");
        c=sc.nextInt();
    }

    void display()
    {
        System.out.println("Addition="+(a+b+c));
    }

}

class Single_inheritance
{
    public static void main(String[] args)
    {
        B aa=new B();

        aa.input();
        aa.getdata();
        aa.add();
        aa.display();
    }
}
