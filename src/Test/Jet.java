package Test;

class Animal{
    String color="White";
}

class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.print(color);
        System.out.print(super.color);
    }
}
public class Jet {
  public static void main(String[] args){
      Dog d1=new Dog();
      d1.printColor();
  }
}
