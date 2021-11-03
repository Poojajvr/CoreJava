class TestFruit
{
public static void main(String []args)
{
Fruit.cut();

Fruit fruit= new Fruit();
fruit.fresh();

String re= fruit.name();
System.out.println(re);
}
}