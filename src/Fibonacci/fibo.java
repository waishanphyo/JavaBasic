package Fibonacci;
public class fibo {
    public static void main(String[] args) {
          int x=0,y=1,count=10,res;
          System.out.print(x+" "+y);
          for(int i=2;i<=count;i++){
              res=x+y;
              System.out.print(" "+res);
              x=y;
              y=res;
          }
    }
}
