class Helmet
{
 String brand;
 String color;
 short price;

 Helmet(String b)
{
   brand=b;
}

 Helmet(String b ,String n,short p)
{
  brand=b;
  color=n ;
  price=p;
    
}
  
  String printall()
{
  
  String display =brand + "\t" + color + "\t" + price;
  
    return display;
}

 }