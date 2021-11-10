class TestGrains
{
public static void main(String []args)
{
Grains gra= new Grains("Paddy");
String re= gra.printAll();
System.out.println(re);
byte b=8;
Grains gr= new Grains("Paddy","golden", b);
String res= gr.printAll();
System.out.println(res);
}
}
