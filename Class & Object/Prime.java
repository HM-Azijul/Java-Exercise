//prime number - class & object
import java.util.Scanner;

class Check
{
    int n;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No To check");
        n=sc.nextInt();
    }

    void putdata()
    {
        int i,count=0;

        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }

        if(count==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

//    public static void main(String args[])
//    {
//        Check aa=new Check();
//
//        aa.getdata();
//        aa.putdata();
//    }

}

class Prime
{
    public static void main(String args[])
    {
        Check aa=new Check();

        aa.getdata();
        aa.putdata();
    }
}
