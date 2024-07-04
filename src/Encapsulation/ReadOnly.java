package Encapsulation;



//A read-only class allows you to read the value of a field but not modify it. This is achieved by providing only a getter method for the field.
public class ReadOnly {
 private String name="Wai Shan Phyo";

 public String getName(){
     return name;
 }
    public static void main(String[] args){
        ReadOnly a=new ReadOnly();
         System.out.print(a.getName());
    }
}
