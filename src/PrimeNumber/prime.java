package PrimeNumber;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num=input.nextInt();
        if(num%2==0){
            System.out.print(num+ "is not prime number");
        }else {
            System.out.print(num+ "is  prime number");
        }
    }
}
