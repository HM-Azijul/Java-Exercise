import java.util.Scanner;

class add
{
    int a,b;

    add() //default Constructor
    {
        a=0;
        b=0;
    }

    add (int x, int y)//Parameterized Constructor
    //same name as class; we take two variable(a,b) so parameter also two(x,y)
    {
        a=x;
        b=y;
    }

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        a=sc.nextInt();

        System.out.println("Enter 2nd Number:");
        b=sc.nextInt();
    }

    void display()//for show a & b value
    {
        System.out.println("a="+a +" b="+b);
    }

    void output()
    {
        int c;
        c=a+b;
        System.out.println("Addition="+c);
    }

    //    public static void main(String[] args)
    //    {
    //        add aa=new add();//if not pass value - it goes default Constructor
    //        aa.display();
    //
    //        aa.input();
    //        aa.output();
    //
    //        //Parameterized Constructor
    //        add bb=new add(5,10); //its pass value/parameter - so it called parameter
    //        bb.display();
    //        bb.output();
    //
    //    }
}

class Constructor
{
    public static void main(String[] args)
    {
        add aa=new add();//if not pass value - it goes default Constructor
        aa.display();

        aa.input();
        aa.output();

        //Parameterized Constructor
        add bb=new add(5,10); //its pass value/parameter - so it called parameter
        bb.display();
        bb.input();
        bb.output();

    }
}
