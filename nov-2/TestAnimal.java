class TestAnimal
{
public static void main(String []args)
{
Animal ani= new Animal();
Animal.grow();

ani.releaseco2();

String re= ani.food();
System.out.println(re);
}
}