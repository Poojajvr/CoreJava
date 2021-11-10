class Crackers{
 String brand;
 String types;
 short price;
  
  Crackers(String b)
{
   brand=b;
}

 Crackers(String b ,String t,short p)
{
  brand=b; 
  types=t ;
  price=p;
    
}
  
String printall()
{
  
String display =brand + "\t" + types + "\t" + price;
  
 return display;
 }

 }