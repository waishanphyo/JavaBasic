package Predictions;

abstract class Chain implements Kov {
   public double[] win(){
        double[] transition={0.5,0.3,0.1};
        return transition;
    }
   public double[] lose(){
     double[] transition={0.4,0.4,0.1};
             return transition;
    }
    public double[] draw(){
        double[] transition={0.3,0.3,0.4};
        return transition;
    }
}
