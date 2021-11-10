class Testhotel
{
public static void main(String []args)
{
Hotel ht= new Hotel();
ht.name="Lakshmi";
String htname= ht.name;
System.out.println(htname);

ht.foodcost=500;
int htfoodcost= ht.foodcost;
System.out.println(htfoodcost);

ht.waiters=50;
byte htwaiters= ht.waiters;
System.out.println(htwaiters);

ht.chairs=40;
byte htchairs= ht.chairs;
System.out.println(htchairs);
}
}