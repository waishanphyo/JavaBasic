package Example;
class Person{
   int id;
   String name;
  Person(int id,String name){
      this.id=id;
      this.name=name;
  }
}
class Employee extends Person{
    float salary;
    Employee(int id,String name,float salary){
        super(id,name);//reusing parent constructor
        System.out.print(id+" "+name+" "+salary);
    }

}
public class TestSuper {
  public static void main(String[] args){
      Employee e1=new Employee(1,"Jhonny",20000);
  }
}
