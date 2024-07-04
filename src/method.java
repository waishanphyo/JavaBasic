public class method {
    int id;String name;

  method(int x,String y){
      id=x;
      name=y;
  }
  void display(){
      System.out.println(id +" "+name);
  }
  public  static void main(String[] args){
      method a=new method(1,"Kyaw");
      method b=new method(2,"Aye");
      a.display();
      b.display();
  }
}
