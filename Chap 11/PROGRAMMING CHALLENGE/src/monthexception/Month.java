package monthexception;

public class Month {
    private int monthNum;
    private String month;

    public Month(int monthNum) throws InvalidNumberOfMonth {
        if (monthNum > 12 || monthNum < 1) {
            throw new InvalidNumberOfMonth("the number of month must be between 1 and 12");

        }
        this.monthNum = monthNum;

    }

    public Month(String month) throws WrongNameOfMonth {
        if (!month.equalsIgnoreCase("January")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("February")) {
            throw new WrongNameOfMonth ("invalid name");
        }  else if (!month.equalsIgnoreCase("March")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("April")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("May")) {
            throw new WrongNameOfMonth ("invalid name");
        } else  if (!month.equalsIgnoreCase("June")) {
            throw new WrongNameOfMonth ("invalid name");
        } else  if (!month.equalsIgnoreCase("July")) {
            throw new WrongNameOfMonth ("invalid name");
        } else  if (!month.equalsIgnoreCase("August")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("September")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("October")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("November")) {
            throw new WrongNameOfMonth ("invalid name");
        } else if (!month.equalsIgnoreCase("December")) {
            throw new WrongNameOfMonth ("invalid name");
        }
        this.month = month;
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

    public String getMonthName() {
        switch (monthNum) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "september";
            case 10:
                return "october";
            case 11:
                return "november";
            case 12:
                return "december";
            default:
                return "january";
        }
    }

    @Override
    public String toString() {
        return "Month{" +
                "monthNum=" + monthNum +
                '}';
    }

    public boolean equals(Month month) {
        if (month.getMonthNumber() == this.monthNum) {
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThan(Month month) {
        if (this.monthNum > month.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThan(Month month) {
        if (this.monthNum < month.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
