class TestTraffic
{
public static void main(String []args)
{
Traffic traffic= new Traffic("Red");
String out= traffic.printAll();
System.out.println(out);

int i=1000;
byte b= 5;
Traffic key= new Traffic("Red",i,b);
System.out.println(key.printAll());
}
}