class Plant
{
String name;
byte noofleaves;
String color;
short flowers;
String[] args= new String[5];

Plant(String []args)
{
System.out.println("plants grow by using water");
for(int i=0;i<sargs.length;i++)
{
System.out.println(args[i]);
}
}
Plant(String n)
{
name= n;
}
Plant(String n, byte b, String c, short f)
{
this(n);
this.noofleaves=b;
this.color=c;
this.flowers=f;
}

String printAll()
{
String display= name + "\t" + noofleaves + "\t" + color + "\t" + flowers;
return display;
}
}
