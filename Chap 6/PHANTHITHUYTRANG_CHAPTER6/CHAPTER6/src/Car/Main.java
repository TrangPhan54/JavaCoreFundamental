package Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car (2020,"ford");
        for (int i = 1;i<=5;i++){
            car.accelerate();
        }
        System.out.println(car.getSpeed());
        for (int i = 1;i<=5;i++){
            car.brake();
        }
        System.out.println(car.getSpeed());





    }
}
