package BatchMarch;

class TestThrowAndThrows
{

//try catch finally throw throws
    static void method1()
    {
        System.out.println("Inside the method1()");
        int a=10/0;// exception will be thrown to called method
        throw new ArithmeticException("throwing ArithmeticException");
    }

    static void method() throws ArithmeticException
    {
        System.out.println("Inside the method()");

        method1();
        throw new ArithmeticException("throwing ArithmeticException");
    }

    public static void main(String args[])
    {
        try
        {
            method();
        }
        catch(NullPointerException e)
        {
            System.out.println("caught in main() method");
        }
    }
}