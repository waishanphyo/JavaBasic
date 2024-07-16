package Currency;

import java.util.Scanner;

public class State {
    public double conv(double value){
        return value/4000;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("MMK TO $");
        double value=sc.nextInt();
        State s=new State();
       System.out.println( s.conv(value)+"$");
    }
}
