import java.util.Scanner;

class Frequency
{
    int []a=new int[10];
    int key;

    void getData ()
    {
        Scanner sc=new Scanner(System.in);
        int i;

        for (i=0; i<10; i++)
        {
            System.out.println("Enter Number");
            a[i]= sc.nextInt();
        }

        System.out.println("Enter Number to find frequency :");
        key= sc.nextInt();
    }

    void count()
    {
        int i, count=0;

        for (i=0;i<10; i++)
        {
            if (a[i]==key)
                count=count+1;
        }
        System.out.println("Frequency = "+count);
    }

}

class FrequencyNumber
{
    public static void main(String[] args) {
        Frequency aa = new Frequency();

        aa.getData();
        aa.count();
    }
}

