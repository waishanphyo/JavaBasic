package Encapsulation;

public class WriteOnly {
    private int value;
    public void setValue(int value){
        this.value=value;
    }
    public static void main(String[] args){
        WriteOnly a=new WriteOnly();
        a.setValue(10000);

    }
}
