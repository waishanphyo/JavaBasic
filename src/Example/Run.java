package Example;
class Animal{
    void eat(){
        System.out.print("eating");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.print("Eat Grass");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.print("Eat Meat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.print("Eat Bread");
    }

}
public class Run {
  public static void main(String[] args){
      Animal a;
      a=new Cow();
      a.eat();
      a=new Cat();

      a.eat();

  }
}
