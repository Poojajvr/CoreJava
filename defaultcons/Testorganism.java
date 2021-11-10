class Testorganism
{
public static void main(String []args)
{
Organism or= new Organism();
or.name="Algae";
String orname= or.name;
System.out.println(orname);

or.colour= "green";
String orcolour= or.colour;
System.out.println(orcolour);

or.forms=8;
byte orforms= or.forms;
System.out.println(orforms);
}
}
