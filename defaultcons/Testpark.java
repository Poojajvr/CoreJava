class Testpark
{
public static void main(String []args)
{
Park pa= new Park();
pa.name="Lalbagh ";
String paname= pa.name;
System.out.println(paname);

pa.entrycost=120;
byte paentrycost= pa.entrycost;
System.out.println(paentrycost);

pa.noofpeople=1000;
int panoofpeople= pa.noofpeople;
System.out.println(panoofpeople);
}
}