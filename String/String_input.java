import java.util.Scanner;

class String_input
{
    public static void main(String[] args) 
    {
        //String str = new String();
        String name = new String();
        String address = new String();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Your Name:");
        name = sc.nextLine(); //next - use only for one word. nextLine - use for multiple word

        System.out.println("Enter Your Address");
        address = sc.nextLine();

        System.out.println("Your Name:"+name +"\nYour Address:"+address);
    }
}

