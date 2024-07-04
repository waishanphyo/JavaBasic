package Example;
class One{
    One() {
        System.out.print("Parent Constructor Worked");
    }
}

public class A extends One{
    A(){
        super();
        System.out.println("Child Constructor Worked");
    }
    {System.out.println("instance initializer block is invoked");}
    public  static void main(String[] args){
        A a= new A();

    }
}
