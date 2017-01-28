package OOP;

/**
 * Created by Sander on 28.01.2017.
 */
public class Korter {

    int kylalised;
    int max;

    public Korter(int mahutab) {
        max = mahutab;

    }

    public void saabus(String taavi) {
        if(kylalised<max) {
            kylalised++;
        }
    }

    public void prindiKylalisteArv() {
        System.out.println("Korteris on " + kylalised + " külalist");

    }

    public void prindiPaljuVeelMahub() {
        if (kylalised<=max){
            System.out.println("Korterisse mahub veel " + (max-kylalised) + " inimest");
        }
        else System.out.println("Korter on juba täis");
    }

    public void lahkus(String taavi) {
        kylalised--;
    }
}
