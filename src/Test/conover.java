package Test;

public class conover {
    int id,age;String name;
conover(int x,String y,int z){
    id=x;
    name=y;
    age=z;
}
conover(int x,String y){
 id=x;
 name=y;
}
void dis(){
    System.out.println(id+" "+name+" "+age);
}
public static void main(String[] args){
    conover c1=new conover(1,"Aye",21);
    conover c2=new conover(2,"Kyaw");
    c1.dis();
    c2.dis();
}
}
