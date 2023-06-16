package testscore;

public class NegativeScore extends IllegalArgumentException {

    public NegativeScore (double amount){
        super("the score ("+amount +") must be greater than 0");
    }
}
