public class FallingDistance {
    public static final double CONSTANT_NUMBER = 9.8;

    public static void main(String[] args) {
        double secondFalling =0;

        fallingDistance(secondFalling);


    }
    public static double fallingDistance (double secondFalling){
        for (secondFalling=1; secondFalling<=10;secondFalling++){
            double  distance = (CONSTANT_NUMBER * Math.pow(secondFalling,2))/2;
            System.out.println("DISTANCE IS " + distance + " METERS");


        }
        return secondFalling;



    }
}
