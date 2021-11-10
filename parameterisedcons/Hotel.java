class Hotel
{
String name;
int foodcost;
byte waiters;
byte chairs;

Hotel(String n)
{
name=n;
}
Hotel(String n, int f, byte w)
{
name=n;
foodcost=f;
waiters=w;
}

String printAll()
{
String display= name + "\t" + foodcost + "\t" + waiters;
return display;
}
}
