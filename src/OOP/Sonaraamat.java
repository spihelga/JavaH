package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Sander on 28.01.2017.
 */
public class Sonaraamat {
    String keel;
    ArrayList<String> koik = new ArrayList<>();
    ArrayList<String> tahega = new ArrayList<>();

    public Sonaraamat(String raamatuKeel) {
    keel = raamatuKeel;
    }

    public void sisestaSona(String sona) {
        koik.add(sona);
    }

    public String[] otsiEsimeseTaheJargi(String taht) {
        tahega.clear();
        for (int i = 0; i < koik.size(); i++) {
            if (koik.get(i).startsWith(taht)) {
                tahega.add(koik.get(i));
            }
        }
        String [] tagasi = new String[tahega.size()];
        for (int i = 0; i < tahega.size(); i++){
            tagasi[i] = tahega.get(i);
        }
        return (tagasi);
    }

    public void eemaldaSona(String eemalda) {
        for (int i = 0; i < koik.size(); i++){
            if (koik.get(i).startsWith(eemalda)){
                koik.remove(i);
            }
        }
    }

    public void misKeelesRaamatOn(String raamatuKeel) {
        System.out.println("Raamatu keel on " + raamatuKeel + "keel");

    }
}
