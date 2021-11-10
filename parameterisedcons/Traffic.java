class Traffic
{
String color;
int noofvehicals;
byte noofpolice;

Traffic(String c)
{
color= c;
}
Traffic(String c, int i, byte b)
{
color= c;
noofvehicals= i;
noofpolice= b;
}

String printAll()
{
String display= color + "\t" + noofvehicals + "\t" + noofpolice;
return display;
}
}

