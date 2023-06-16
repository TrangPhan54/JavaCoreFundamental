package gradeactivity;

public class Essay1 extends GradedActivity {
    private double grammarScore;
    private double spellingScore;
    private double correctLengthScore;
    private double contentScore;

    public Essay1(double score, double grammarScore, double spellingScore, double  correctLengthScore, double contentScore) {
        super(score);
        if (this.grammarScore<=30)
            this.grammarScore = grammarScore;
        else {
            this.grammarScore=0;

        }
        if (this.spellingScore<=20)
            this.spellingScore = spellingScore;
        else{
            this.spellingScore =0;
        }
        if (this.correctLengthScore<=20)
            this.correctLengthScore = correctLengthScore;
        else {
            this.correctLengthScore =0;
        }
        if (this.contentScore<=30)
            this.contentScore = contentScore;
        else {
            this.contentScore = 0;

        }

    }

    public char getGrade() {
        double score = this.grammarScore+this.spellingScore+this.correctLengthScore+this.contentScore;
        return super.getGrade(score);
    }

    public double getGrammarScore() {
        return grammarScore;
    }

    public void setGrammarScore(double grammarScore) {
        this.grammarScore = grammarScore;
    }

    public double getSpellingScore() {
        return spellingScore;
    }

    public void setSpellingScore(double spellingScore) {
        this.spellingScore = spellingScore;
    }

    public double getCorrectLengthScore() {
        return correctLengthScore;
    }

    public void setCorrectLengthScore(double correctLengthScore) {
        this.correctLengthScore = correctLengthScore;
    }

    public double getContentScore() {
        return contentScore;
    }

    public void setContentScore(double contentScore) {
        this.contentScore = contentScore;
    }
}
