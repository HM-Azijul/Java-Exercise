import java.util.Scanner;
class Check
{
    int a,b; //Class Variable

    void getdata()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number:");
        a= sc.nextInt();

        System.out.println("Enter Second Number:");
        b=sc.nextInt();
    }

    void putdata()
    {
        System.out.println("Addition = "+(a+b));
    }

    //    public static void main(String[] args)
    //    {
    //        Check aa = new Check();
    //        aa.getdata();
    //
    //        aa.putdata();
    //    }

}

class Add
{
    public static void main(String[] args)
    {
        Check aa = new Check();
        aa.getdata();

        aa.putdata();

    }
}