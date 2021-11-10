class Earphone
{
 String brand;
 String name;
 short price;

 Earphone(String b)
{
   brand=b;
}

 Earphone(String b ,String n,short p)
{
  brand=b;
  name=n ;
  price=p;
    
}
  
  String printall()
{
  
  String display =brand + "\t" + name + "\t" + price;
  
    return display;
}

 }