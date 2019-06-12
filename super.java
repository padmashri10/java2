class Parent
{
   int x = 5;
   void show()
   {
       System.out.println("Method of parent class using Super Keyword");
   }
}
class Child extends Parent
{
   int x = 9;
   void show()
   {
       System.out.println("Instance Variable of Parent class using Super Keyword :"+super.x);
       System.out.println("Instance variable of Child class :"+x);
       super.show();
       System.out.println("Method of Child class ");
   }
   public static void main(String... a)
   {
	Child ob = new Child();
	ob.show();
   }
}


