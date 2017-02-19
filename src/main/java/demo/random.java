package demo;

import java.util.Random;

/**
 * Created by Veiko on 19.02.2017.
 */
public class random {
    public int getRandomNumber(int min,int max)
    {
        Random rand = new Random();

        int  n = rand.nextInt(max - min + 1) + min;
        return n;
    }
}
