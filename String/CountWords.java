import java.util.Scanner;

class CountWords
{
    public static void main(String[] args)
    {
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        str = sc.nextLine();

        int i, count = 1;
        for (i = 0; i < str.length() - 1; i++) //-1 because in d we add +1 with i;
        {
            char c = str.charAt(i),
                    d = str.charAt(i + 1);

            if (c == ' ' && d != ' ')
            {
                count++;
            }

        }
        System.out.println("Total Words = "+ count);
    }
}