class Keyboard
{
String name;
byte noofkeys;
float weight;

Keyboard(String n)
{
name= n;
}

Keyboard(String n, byte b, float f)
{
name= n;
noofkeys= b;
weight= f;
}

String printAll()
{
String display= name +"\t" + noofkeys + "\t" + weight;
return display;
}
}