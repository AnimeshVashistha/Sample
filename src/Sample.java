import java.io.*;
class Test
{
    int a;
    Test()
    {
        System.out.println("Default Constructor called");
    }
}

class Sample
{
    public static void main(String[] args)
    {
        //Creating a new object of Test class
        Test obj = new Test();
        //Default constructor provides the defualt value to data member 'a'
        System.out.println(obj.a);
    }
}

