import java.util.Scanner;

class StringFunction
{
    public static void main(String[] args)
    {
        String s=new String();
        int len,i;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String:"); //HM Azijul
        s=sc.nextLine();
        len=s.length();

        System.out.println("The String is : "+s);
        System.out.println("The length of the String is : "+len);

        for (i=0; i<len; i++)
            System.out.println(s.charAt(i));

    }
}

