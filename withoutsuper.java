class Super
{
    int a = 5, b = 6;
    int add()
    {
        int c = a + b;
        return c;
    }
}
public class Sub extends Super
{
    void show()
    {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("Result:"+add());
    }
    public static void main(String[] args)
    {
        Sub obj = new Sub();
        obj.show();
    }
}