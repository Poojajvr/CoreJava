class Testkingdom
{
public static void main(String []args)
{
Kingdom kd= new Kingdom();
kd.name="The Kadambas";
String kdname= kd.name;
System.out.println(kdname);

kd.noofkings=1;
byte kdnoofkings= kd.noofkings;
System.out.println(kdnoofkings);

kd.state="Karnataka";
String kdstate= kd.state;
System.out.println(kdstate);

kd.noofpeople=2000;
int kdnoofpeople= kd.noofpeople;
System.out.println(kdnoofpeople);
}
}


