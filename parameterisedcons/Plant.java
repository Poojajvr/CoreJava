class Plant
{
String name;
byte noofleaves;
String color;
short flowers;

Plant(String n)
{
name= n;
}
Plant(String n, byte b, String c, short f)
{
name=n;
noofleaves=b;
color=c;
flowers=f;
}

String printAll()
{
String display= name + "\t" + noofleaves + "\t" + color + "\t" + flowers;
return display;
}
}
