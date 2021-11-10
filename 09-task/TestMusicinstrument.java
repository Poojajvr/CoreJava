class TestMusicinstrument
{
public static void main(String []args)
{
Musicinstrument music= new Musicinstrument(args);

Musicinstrument instrument= new Musicinstrument("Piano");
String out= instrument.printAll();
System.out.println(out);

byte b=100;
Musicinstrument songs= new Musicinstrument("Piano","black",b);
String re= songs.printAll();
System.out.println(re);
}
}