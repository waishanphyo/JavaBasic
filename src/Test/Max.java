package Test;

public class Max {
    public static int max(int x,int y,int z){
        int max=x;
        if(y>max){
           max=y;
        }
        if(z>max){
            max=z;
        }
        return max;
    }
    public static void main(String[] args){
         System.out.println(max(10,20,30));
    }
}
