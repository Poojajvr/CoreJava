class TestDogs
{
public static void main(String []args)
{
Dogs dog= new Dogs();
dog.structure();

String re= dog.color();
System.out.println(re);

int r=Dogs.noofdogs();
System.out.println(r);

}
}