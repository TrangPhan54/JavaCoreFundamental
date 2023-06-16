package testscore;

public class MoreThanOneHundred extends IllegalArgumentException {
    public MoreThanOneHundred (double amount){
        super("the score ("+amount +") must be less than 100");
    }
}
