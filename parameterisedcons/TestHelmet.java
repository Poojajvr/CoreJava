class TestHelmet
{
  public static void main(String []args)
{
 Helmet cr=new Helmet("LS2 Helmets");
 String res=cr.printall();
 System.out.println(res);
 
 short price=200;
     
 Helmet ke=new Helmet("LS2 Helmets","black", price);
 System.out.println(ke.printall());
 
     }

}
  