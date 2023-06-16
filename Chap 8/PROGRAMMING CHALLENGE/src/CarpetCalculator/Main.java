package CarpetCalculator;

public class Main {
    public static void main(String[] args) {
        RoomDimension room1 = new RoomDimension(12,13);
        double re = room1.getArea();
        System.out.println("the area is "+ re);
        RoomCarpet cost1 = new RoomCarpet(room1,8);
        double total = cost1.getTotalCost();
        System.out.println("The total cost of carpet is "+ total);

    }
}
