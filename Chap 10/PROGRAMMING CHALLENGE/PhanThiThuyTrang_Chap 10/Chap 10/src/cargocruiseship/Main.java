package cargocruiseship;

public class Main {
    public static void main(String[] args) {
        Ship [] ship = new Ship[3];
        ship[0] = new Ship ("Titanic","1912");
        ship [1] = new CruiseShip("Napoleon","2000",500);
        ship [2] = new CargoShip("Victor Hugo","1878",48);
        for (Ship sh: ship){
            System.out.println(sh.toString());
        }
    }
}
