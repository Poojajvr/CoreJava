class MusicInstrument
{
String name;
int price;
byte size;

MusicInstrument(String n)
{
name= n;
}

MusicInstrument(String n, int i, byte b)
{
name=n;
price=i;
size=b;
}

String printAll()
{
String display= name + "\t" + price +"\t" + size;
return display;
}
}