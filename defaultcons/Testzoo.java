class Testzoo
{
public static void main(String []args)
{
Zoo ob= new Zoo();
ob.name="Mysore zoo";
String obname= ob.name;
System.out.println(obname);

ob.noofanimals=100;
byte obnoofanimals= ob.noofanimals;
System.out.println(obnoofanimals);

ob.cost=2000;
int obcost= ob.cost;
System.out.println(obcost);
}
}