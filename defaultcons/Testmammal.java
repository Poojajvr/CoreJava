class Testmammal
{
public static void main(String []args)
{
Mammal hb= new Mammal();
hb.name="humans";
String hbname= hb.name;
System.out.println(hbname);

hb.age=25;
byte hbage= hb.age;
System.out.println(hbage);

hb.weight=70;
int hbweight= hb.weight;
System.out.println(hbweight);
}
}