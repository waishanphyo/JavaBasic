package Test;

public class Sv {
static int count=0;//will get memory only once and retain its value
Sv(){
    count++;
    System.out.println(count);
}

public static void main(String[] args){
    Sv s1=new Sv();
    Sv s2=new Sv();
}
}
