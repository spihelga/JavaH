package Algoritm;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        ArrayList<Integer> uus = new ArrayList();

        for (int i = 0; i < naide.length; i++) {
            if (naide[i] != 3 ) {
                uus.add(naide[i]);
            }
        }
        //System.out.println(uus);
        int a = 0;
        for (int j = 0; j < uus.size(); j++) {
            int sagedus = Collections.frequency(uus, uus.get(j));
            if (sagedus > a) {
                a = uus.get(j);
            }
        }
        System.out.println(a);
    }

}
