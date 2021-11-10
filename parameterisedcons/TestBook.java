class TestBook
{
public static void main(String []args)
{

Book boo= new Book("JB book");
String re= boo.printAll();
System.out.println(re);
byte b=50;
int i=400;
Book booo= new Book("JB book",b,i,"white");
String res= booo.printAll();
System.out.println(res);
}
}