class TestEarphone
{
  public static void main(String []args)
{
 
  Earphone rs=new Earphone(args);
     

  Earphone cr=new Earphone("boat");
  String res=cr.printall();
  System.out.println(res);
 
    short price=2000;
     
  Earphone ke=new Earphone("boat","earbud", price);
   System.out.println(ke.printall());
 
     }

}
  