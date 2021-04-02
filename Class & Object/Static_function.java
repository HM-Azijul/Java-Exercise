class Student
{
    int roll;
    String name;

    static String Cname = "BM-College"; //College Name

    Student(int x, String y)
    {
        roll=x;
        name=y;
    }

    void display()
    {
        System.out.println("Roll="+roll+ " Name="+name +" Collage-Name="+Cname);
    }

    static void change() //static member function
    {
        Cname="ABC";
    }

}

class Static_function
{
    public static void main(String[] args)
    {
        Student aa = new Student(101, "Azijul");
        Student bb = new Student(102, "Tom");

        aa.display();
        bb.display();

        Student.change();//static member function-change college name
        aa.display();
        bb.display();
    }
}
