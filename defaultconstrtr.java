class Sup
{
    static int a, b;
    Sup()
    {
       System.out.println("super class default constructor");
    }
}
public class Sub extends Sup
{
    Sub()
    {
        System.out.println("sub class default constructor");
    }
    public static void main(String[] args)
    {
       new Sub();
    }
}
