public class Bai6 {
    public static void main(String[] args) {
        System.out.println(returnFirstNumber(123));

    }
    public static int returnFirstNumber (int number){
        if (number<10){
            return number;
        }
        else {
            return returnFirstNumber(number/10);
        }
    }

}
