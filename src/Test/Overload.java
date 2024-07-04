package Test;

// a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
public class Overload {
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String[] args){
        System.out.println(add(10,10));
        System.out.print(add(10,20,15));
    }

}
