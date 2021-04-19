import java.util.Scanner;

class linear
{
    int []a = new int[10];
    int key;

    void getData()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for (i=0;i<10;i++)
        {
            System.out.println("Enter No:");
            a[i]= sc.nextInt();
        }

        System.out.println("Enter No to Search:");
        key= sc.nextInt();
    }

    void search()
    {
        int i,flag=0,position=0;

        for (i=0; i<10 && flag==0; i++)
        {
            if (a[i]==key)
            {
                flag=1; //we found number
                position=i+1;
            }
        }

        if (flag==1)
            System.out.println("Number found at : "+position);
        else
            System.out.println("Number Not Found");
    }

}

class LinearSearch
{
    public static void main(String[] args) {
        linear aa=new linear();

        aa.getData();
        aa.search();
    }
}