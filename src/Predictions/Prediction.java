package Predictions;

public class Prediction extends Chain {
    int nextEvent=2;
    public int[] arr;
    Prediction(int one,int two,int draw){
        this.arr=new int[3]; //Initialize the array with a length of 3
        this.arr[0]=one;
        this.arr[1]=two;
        this.arr[2]=draw;
    }
    public void outcome(){
      for(int num:arr){
          if(num==1){
              double[] win=win();
              nextEvent=nextEvent+1;
              System.out.print(" Win"+win[0]+win[1]+win[2]+"nextEvent"+nextEvent);
          } else if (num==2) {
              double[] lose=lose();
              nextEvent=nextEvent-1;
              System.out.print("Lose"+lose[0]+lose[1]+lose[2]+"nextEvent"+nextEvent);
          }else if(num==0){
              double[] draw=draw();
              nextEvent=nextEvent;
              System.out.print("Draw"+draw[0]+draw[1]+draw[2]+nextEvent);
          }
      }

    }

}
