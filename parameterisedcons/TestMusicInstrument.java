class TestMusicInstrument
{
public static void main(String []args)
{
MusicInstrument music= new MusicInstrument ("Piano");
String out= music.printAll();
System.out.println(out);

int i=1000;
byte b= 5;
MusicInstrument key= new MusicInstrument ("Piano",i,b);
System.out.println(key.printAll());
}
}