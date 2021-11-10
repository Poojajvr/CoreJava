class Musicinstrument
{
String name;
String color;
byte weight;
String[] args=new String[2];

Musicinstrument(String []args)
{
System.out.println("music is beautiful");
for(int i=0;i<args.length;i++)
{
System.out.println(args[i]);
}
}
Musicinstrument(String n)
{
name= n;
}
Musicinstrument(String n, String c, byte m)
{
this(n);
this.color= c;
this.weight= m;
}
String printAll()
{
String display= name + "\t" + color + "\t" + weight;
return "display";
}
}