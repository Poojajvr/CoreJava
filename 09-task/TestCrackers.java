class TestCrackers{
  public static void main(String []args){
 
  Crackers rs=new Crackers(args);
     

  Crackers cr=new Crackers("lakshmi bomb");
  String res=cr.printall();
  System.out.println(res);
 
    short price=2000;
     
  Crackers ke=new Crackers("lakshmi bomb","rocket", price);
   System.out.println(ke.printall());
 
     }

}
  