package DaysInMonth;

public class MonthsDay {
    private int month;
    private int year;

    public MonthsDay(int month, int year) {
        this.month = month;
        this.year = year;
    }
    public int numberOfDays(){
        int day = 0 ;
         switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31 ;
            break;
            case 4: case 6: case 9: case 11:  day = 30;
            break;
            case 2:
                 if (year%100==0 && year%400!=0){
                 day = 28;
             }
             if ((year%100!=0 && year%4==0) || year%400==0){
                 day = 29;
             }


        }
        return day;

    }
}
