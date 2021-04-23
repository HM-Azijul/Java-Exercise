//Count Total Vowel and Consonant in a String
import java.util.Scanner;

class CountVowel
{
    public static void main(String[] args)
    {
        String s=new String();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter String:");
        s=sc.nextLine();
        s=s.toUpperCase(); //all make uppercase word. So, that we don't need to check small case

        int i, vowel,cons;
        vowel=cons=0;

        for (i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);

            if(ch!=' ')
            {
                if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    vowel++;
                else
                    cons++;
            }
        }
        System.out.println("Vowels = "+vowel +"\nConsonant = "+cons);
    }
}

