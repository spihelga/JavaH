package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3
        int count = 0;
        double sum = 0;
        int words = naide.length;

        for (int i = 0; i < naide.length; i++) {
            count = naide[i].length();
            sum = sum + count;

        }
        double avg = sum / words;
        int countmore = 0;
        for (int i = 0; i < naide.length; i++) {
            if (naide[i].length() > avg) {
                countmore++;
            }
        }

        System.out.println(countmore);
    }
}
