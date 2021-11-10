class Book
{
String name;
byte pages;
int price;
String color;
String[] args=new String[5];

Book(String []args)
{
System.out.println("used to write");
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
}
}
Book(String n)
{
name=n;
}
Book(String n, byte b, int i, String c)
{
this(n);
this.pages=b;
this.price=i;
this.color=c;
}
String printAll()
{
String display=name + "\t" + pages + "\t" + price + "\t" + color;
return display;
}
}
 