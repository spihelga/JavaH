package OOP;

/**
 * Created by Sander on 28.01.2017.
 */
public class Zelda {

    int zelusid;

    public Zelda(int elusid) {
        zelusid = elusid;
        //System.out.println(zelusid);
    }

    public void kaklusKolliga(int kollilElusid) {
        zelusid = zelusid - kollilElusid;

    }

    public void prindiMituEluAlles() {
        System.out.println("Zeldal on veel " + zelusid + " elu alles");
    }

    public void prindiKasOnElus() {
        if (zelusid>0){
            System.out.println("Zelda on elus!");
        }
        else
            System.out.println("Koll võitis selle roundi");

    }
}
