package Helpers;

import java.util.Random;

public class Helpers {
    Random random = new Random();
    public int generateId() {
        return Math.abs(random.nextInt(10000));
    }

}
