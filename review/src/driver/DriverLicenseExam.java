package driver;

public class DriverLicenseExam {
    private String [] correctAnswer = {"B","D", "A", "A", "C", "A", "B", "A", "C", "D" ,"B", "C", "D", "A", "D", "C","C","D" ,"D" ,"A"};
    private String [] studentAnswer = new String [20];

    public DriverLicenseExam(String[] studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public String[] getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String[] correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String[] getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String[] studentAnswer) {
        this.studentAnswer = studentAnswer;
    }
    public boolean passed (){
        int number = totalCorrect ();
        if (number>=15){
            return true;
        }
        return false;

    }
    public int totalCorrect (){
        int sum = 0;
        for(int i = 0; i<studentAnswer.length; i++){
            if (correctAnswer[i].equalsIgnoreCase(studentAnswer[i])){
                sum+=1;
            }

        }
        return sum;
    }
    public int totalIncorrect (){
        int sum = 0;
        for(int i = 0; i<studentAnswer.length; i++){
            if (!correctAnswer[i].equalsIgnoreCase(studentAnswer[i])){
                sum+=1;
            }

        }
        return sum;

    }


}
