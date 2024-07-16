package CarParking;

public class CarPark {
    int capacity;
    int spaces;
    public int increase(){
       if(spaces!=capacity){

       }

        return spaces++;
    }
    public int decrease(){
        if(spaces>0) {
            spaces--;
        } else{
            spaces=0;
            FullSign a=new FullSign();
        }
        return spaces;
    }
    public int spacesLeft(){
        return spaces;
    }
}
