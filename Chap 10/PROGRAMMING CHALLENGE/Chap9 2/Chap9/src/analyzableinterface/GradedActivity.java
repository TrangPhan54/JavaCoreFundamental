package analyzableinterface;

public class GradedActivity {
    private int score;
    private int maxScore;

    public GradedActivity(int score, int maxScore) {
        this.score = score;
        this.maxScore = maxScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
    public double percentage(){
        double percent = getScore();
        percent /= getMaxScore();
        percent*=100;
        return percent;
    }
}
