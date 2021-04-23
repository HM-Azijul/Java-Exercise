import java.util.Scanner;

class String_buffer
{
    public static void main(String[] args)
    {
        StringBuffer str=new StringBuffer();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String:");
        str.append(sc.nextLine());

        str.setCharAt(3, 'u');
        System.out.println(str);

        str.insert(3,"ABCD");
        System.out.println(str);

        str.setLength(20);
        System.out.println(str);

    }
    
}

