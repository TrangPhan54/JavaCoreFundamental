package CarpetCalculator;

public class RoomCarpet {
    private RoomDimension room;
    private double cost;


    public RoomCarpet(RoomDimension room, double cost) {
        this.room = room;
        this.cost = cost;
    }

//    public double getCost() {
//        return cost;
//    }

    public double getTotalCost (){
        return room.getArea()*cost;
    }

//    @Override
//    public String toString() {
//        return "RoomCarpet{" +
//                "cost=" + cost +
//                '}';
//    }
}
