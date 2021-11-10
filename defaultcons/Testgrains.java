class Testgrains
{
public static void main(String []args)
{
Grains no= new Grains();
no.typesofgrains=10;
byte notypesofgrains= no.typesofgrains;
System.out.println(notypesofgrains);

no.name="Rice";
String noname= no.name;
System.out.println(noname);

no.color="white";
String nocolor= no.color;
System.out.println(nocolor);
}
}