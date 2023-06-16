package MonthClass;

public class Month {
    private int monthNum;
    private String month;

    public Month() {
        this.monthNum = 1;
    }
    public Month(int monthNum) {
        if (this.monthNum>12 || this.monthNum<1){
            this.monthNum = 1;

        } else {
            this.monthNum = monthNum;
        }
    }
    public Month(String month){
        this.month = month;
        if(this.month.equalsIgnoreCase("January")){
            this.monthNum =1;
        }
        else if (this.month.equalsIgnoreCase("February")){
            this.monthNum = 2;
        }
        else if (this.month.equalsIgnoreCase("March")){
            this.monthNum = 3;
        }
        else if (this.month.equalsIgnoreCase("April")){
            this.monthNum = 4;
        }
        else if (this.month.equalsIgnoreCase("May")){
            this.monthNum = 5;
        }
        else if (this.month.equalsIgnoreCase("June")){
            this.monthNum = 6;
        }
        else if (this.month.equalsIgnoreCase("July")){
            this.monthNum = 7;
        }
        else if (this.month.equalsIgnoreCase("August")){
            this.monthNum = 8;
        }
        else if (this.month.equalsIgnoreCase("September")){
            this.monthNum = 9;
        }
        else if (this.month.equalsIgnoreCase("October")){
            this.monthNum = 10;
        }
        else if (this.month.equalsIgnoreCase("September")) {
            this.monthNum = 9;
    }
        else if (this.month.equalsIgnoreCase("October")) {
        this.monthNum = 10;
    }
        else if (this.month.equalsIgnoreCase("November")) {
        this.monthNum = 11;
    }
        else if (this.month.equalsIgnoreCase("December")) {
        this.monthNum = 12;
    }
    }
    public void setMonthNumber(int monthNum) {
        //this.monthNumber = monthNumber;
        if (monthNum >= 1 && monthNum <= 12) {
            this.monthNum = monthNum;
        } else {
            monthNum = 1;
        }
    }

    public int getMonthNumber() {
        return monthNum;
    }
    public String getMonthName (){
        switch(monthNum){
            case 1 : return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "september";
            case 10: return "october";
            case 11: return "november";
            case 12: return "december";
            default: return "january";
        }
    }

    @Override
    public String toString() {
        return "Month{" +
                "monthNum=" + monthNum +
                '}';
    }

    public boolean equals (Month month){
        if (month.getMonthNumber()==this.monthNum){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean greaterThan (Month month){
        if (this.monthNum>month.getMonthNumber()){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean lessThan (Month month){
        if (this.monthNum<month.getMonthNumber()){
            return true;
        }
        else{
            return false;
        }
    }





}
