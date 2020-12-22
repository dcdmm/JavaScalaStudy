package z_useful_class;

import java.util.Random;

/**
 * Random类:随机数生成
 */
public class RandomClass {
    public static void main(String[] args) {
        Random ra = new Random();
        // Returns a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
        int ra_number = ra.nextInt(10); // [0, 10)
        System.out.println(ra_number);
    }
}
