class Testoperatingsystem
{
public static void main(String []args)
{
Operatingsystem os= new Operatingsystem();
os.name="Linux";
String osname= os.name;
System.out.println(osname);
os.version=2.5f;
float osversion= os.version;
System.out.println(osversion);
os.price=1800;
int osprice=os.price;
System.out.println(osprice);
}
}