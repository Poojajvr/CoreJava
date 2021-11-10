class Book
{
String name;
byte pages;
int price;
String color;

Book(String n)
{
name=n;
}
Book(String n, byte b, int i, String c)
{
name=n;
pages=b;
price=i;
color=c;
}
String printAll()
{
String display=name + "\t" + pages + "\t" + price + "\t" + color;
return display;
}
}
 