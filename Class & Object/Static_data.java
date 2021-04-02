class Student
{
    int roll;
    String name;

    static String college = "BM College"; // for all student(object) college same

    Student(int x, String y)
    {
        roll=x;
        name=y;
    }

    void display()
    {
        System.out.println("Roll="+roll+ " Name="+name +" Collage-Name="+college);
    }

}

class Static_data
{
    public static void main(String args[])
    {
        Student aa = new Student(101, "Azijul");
        Student bb = new Student(122, "Shakil");

        aa.display();
        bb.display();
    }
}