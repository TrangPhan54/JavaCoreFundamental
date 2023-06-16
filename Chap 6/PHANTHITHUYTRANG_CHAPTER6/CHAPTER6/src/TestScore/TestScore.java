package TestScore;

public class TestScore {
    private double firstScore;
    private double secondScore;
    private double thirdScore;

    public TestScore() {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
    }

    public double getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(double firstScore) {
        this.firstScore = firstScore;
    }

    public double getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(double secondScore) {
        this.secondScore = secondScore;
    }

    public double getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(double thirdScore) {
        this.thirdScore = thirdScore;
    }
    public double averageScore() {
        double averageScore = (firstScore + secondScore + thirdScore) / 3;
        return averageScore;
    }

}
