class TestHotel
{
  public static void main(String []args)
{
 Hotel ho=new Hotel("orbis");
 String res=ho.printAll();
 System.out.println(res);
 
int i=200;
byte b=10;
     
 Hotel hol=new Hotel("orbis",i,b);
 System.out.println(hol.printAll());
 
}

}
  