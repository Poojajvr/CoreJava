class Grains
{
byte typesofgrains;
String name;
String color;

Grains(String n)
{
name=n;
}
Grains(String n, String c, byte t)
{
name=n;
color=c;
typesofgrains=t;
}

String printAll()
{
String display= name + "\t" + color + "\t" + typesofgrains;
 return display;
}
}