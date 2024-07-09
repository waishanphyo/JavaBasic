package OOSD;

public class Counter {
    private int score=0;
    public String data="Information";
    public int getScore(){
        return score;
    }
    public void  increase(){
        this.score++;
    }
    public void decrease(){
        //foul on Var
        this.score--;
    }
}
