package OOSD;

public class Cscore {
    public static void main(String[] args){
        Counter sc=new Counter();
        sc.increase();
        sc.decrease();
        sc.increase();
        System.out.print(sc.getScore());
        System.out.print(sc.data);
        System.out.print(sc.data);
    }
}
