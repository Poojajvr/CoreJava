class TestPlant
{
public static void main(String []args)
{
Plant mp= new Plant(args);

Plant mmp= new Plant("rose plant");
String re= mmp.printAll();
System.out.println(re);

byte b=120;
short f=25;
Plant mmmp= new Plant("rose plant",b,"green",f);
System.out.println(mmmp.printAll());
}
}