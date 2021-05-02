//Vector Function
import java.util.*;

class Vector_Methods
{
    public static void main(String[] args)
    {
        Vector list=new Vector();

        list.addElement("Hasan");
        list.addElement("Mahmud");
        list.addElement("Azijul");
        System.out.println("The List is : "+list);

        list.insertElementAt("Jerry",1);
        System.out.println("The List now is : "+list);

        System.out.println("Size of Vector = "+list.size());

        list.removeElement("Jerry");
        System.out.println("After Removing Jerry "+list);

        list.removeElementAt(1);
        System.out.println("After Removing First Index "+list);

        list.removeAllElements();
        System.out.println("After Removing All "+list);
    }
}

