package PayRoll;

public class PayRoll {
    private int [] employId = {5658845 , 4520125 ,7895122, 8777541,
            8451277, 1302850 ,7580489};
    private int [] hours = new int [7];
    private double [] payRate = new double [7];
    private double [] wages = new double [7];

//    public PayRoll(int[] employId, int[] hours, double[] payRate, double[] wages) {
//        this.employId = employId;
//        this.hours = hours;
//        this.payRate = payRate;
//        this.wages = wages;
//    }

    public int[] getEmployId() {
        return employId;
    }

    public void setEmployId(int[] employId) {
        this.employId = employId;
    }

    public int[] getHours() {
        return hours;
    }

    public void setHours(int[] hours) {
        this.hours = hours;
    }

    public double[] getPayRate() {
        return payRate;
    }

    public void setPayRate(double[] payRate) {
        this.payRate = payRate;
    }

    public double[] getWages() {
        return wages;
    }

    public void setWages(double[] wages) {
        this.wages = wages;
    }
    public double getGrossPay (int idNumber){
        int index = findEmployee(idNumber);
            if (index!=-1){
                return this.hours[index]*this.payRate[index];
            }
            else {
                return 0;
            }

        }



    public int findEmployee (int idNumber ){
        int index = -1;
        for (int i = 0; i<employId.length; i++){
            if (employId[i]==idNumber){
                index = i;
            }
        }
        return index;


    }
}
