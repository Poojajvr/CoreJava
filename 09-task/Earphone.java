class Earphone
{
 String brand;
 String name;
 short price;

 String[] args=new String[5];
 
   Earphone(String []args)
{
   System.out.println("types of earphones");
   for(int i=0;i<args.length;i++)
{
    System.out.println(args[i]);
}

}
  
  Earphone(String b)
{
   brand=b;
}

 Earphone(String b ,String n,short p)
{
  this(b) ;
  this.name=n ;
  this.price=p;
    
}
  
  String printall()
{
  
  String display =brand + "\t" + name + "\t" + price;
  
    return display;
}

 }