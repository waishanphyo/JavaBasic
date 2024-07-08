package OOSD;

public class Counter {
    private int score=0;
    public int getScore(){
        return score;
    }
    public void  increase(){
        this.score=score+1;
    }
    public void decrease(){
        //foul on Var
        this.score=score-1;
    }
}
