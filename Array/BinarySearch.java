//Binary Search in Java
import java.util.Scanner;

class binary
{
    int []a=new int[10];
    int key;

    void getData()
    {
        Scanner sc=new Scanner(System.in);
      int i;
      for (i=0;i<10;i++)
      {
          System.out.println("Enter Number:");
          a[i]=sc.nextInt();
      }

      System.out.println("Enter Number to Search");
      key=sc.nextInt();
    }

    void search()
    {
        int i=0,j=9;
        int mid, flag=0, position=-1;

        while (i<=j && flag==0)
        {
            mid=(i+j)/2;

            if (a[mid]==key)
            {
                flag=1;
                position=mid+1;
            }

            if(a[mid]>key)
            {
                i=mid-1;
            }

            if (a[mid]<key)
            {
                i=mid+1;
            }
        }

        if (flag==0)
            System.out.println("Number Not found");
        else
            System.out.println("Number Found at "+position);
    }
}

class BinarySearch
{
    public static void main(String[] args) {
        binary aa=new binary();

        aa.getData();
        aa.search();
    }
}