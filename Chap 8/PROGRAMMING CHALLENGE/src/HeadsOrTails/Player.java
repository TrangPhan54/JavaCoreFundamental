package HeadsOrTails;

public class Player {
    private String name;
    private Coin coin;
    private int points;

    public Player(String nameStr) {
        name = nameStr;
        points = 0;
    }

    public void setPoints() {
        points++;
    }

    public void minusPoint() {
        points--;
    }

    public int getPoints() {
        return points;
    }
}
