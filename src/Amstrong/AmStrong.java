package Amstrong;

import java.util.Scanner;

public class AmStrong {
  static boolean amstrong(int n){
    int base=0,power=0,sum=0,temp;
    temp=n;
    while (temp>0){
      temp=temp/10;
      power++;
    }
    temp=n;
    while (temp>0){
      base=temp%10;
      sum +=  (Math.pow(base, power));
      //removes the last digit
      temp = temp/10;
    }
    if(n==sum) {
      return true;
    }else return false;
  }
  public  static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    for(int i=0;i<=num;i++){
      if(amstrong(i)){
        System.out.print(i+ ", ");
      }
    }
  }
}


