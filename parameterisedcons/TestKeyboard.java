class TestKeyboard
{
public static void main(String []args)
{
Keyboard keyboard= new Keyboard("Dell");
String board= keyboard.printAll();
System.out.println(board);

byte b=100;
Keyboard key= new Keyboard("Dell",b,2.0f);
System.out.println(key.printAll());
}
}