class A
{
    void message() //final void message() 
    {
        System.out.println("Welcome to Base Class");
    }
}

class B extends A
{
    void message()
    {
        System.out.println("Welcome to Derived Class");
    }
}

class Method_overriding
{
    public static void main(String[] args)
    {
        B aa=new B();
        aa.message();
    }
}

