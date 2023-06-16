package HeadsOrTails;

import java.util.Random;

public class Coin {
    private String sideUp;

    public Coin() {
        toss();
    }

    public void toss() {
        Random randomNum = new Random();
        int random = randomNum.nextInt(2);
        if (random == 0) {
            sideUp = "Heads";
        } else {
            sideUp = "Tails";
        }
    }

    public String getSideUp() {
        return sideUp;
    }
}
