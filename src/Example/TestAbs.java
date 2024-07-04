package Example;

abstract class Shape{
    abstract void draw();
}
class Triangle extends Shape{
    void draw(){
        System.out.print("Triangle is Drawing");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.print("Circle is Drawing");
    }
}
public class TestAbs {
  public static void main(String[] args){
    Shape s=new Circle();
    s.draw();
  }

}
