package Fibonacci;

public class Recursive {
    static int x=0,y=1,res;
    static void printFibo(int count){
        if(count>0){
            res=x+y;
            x=y;
            y=res;
            System.out.print(" "+res);
            printFibo(count-1);
        }
    }
public static void main(String[] args){
   int count=10;
   System.out.print(x+" "+y);
   printFibo(count-2);
}
}
