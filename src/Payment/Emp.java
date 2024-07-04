package Payment;

public class Emp {
  int id;
  String name;
  Address address;
   public Emp(int id,String name,Address address){
       this.id=id;
       this.name=name;
       this.address=address;
   }
   void dis(){
       System.out.print(id+" "+name+" "+address.state+" "+address.city+" "+address.country);
   }
  public static void main(String[] args){
    Address address1=new Address("Bago","Taungoo","Burma");
    Emp e1=new Emp(1,"Thar Aye",address1);
    e1.dis();
  }
}
