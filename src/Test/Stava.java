package Test;

public class Stava {
    int id;
    String name;
    String uni="UCSTGO";//static variable it saves memory
    Stava(int x,String y){
        this.id=x;
        this.name=y;
    }
    void dis(){
        System.out.println(id+" "+name+" "+uni);
    }
    public static void main(String[] args){
        Stava s1=new Stava(1,"Thar");
        Stava s2=new Stava(2,"Aye");
        s1.dis();
        s2.dis();
    }
}
