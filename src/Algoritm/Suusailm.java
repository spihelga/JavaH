package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        int ref = 0;
        int k1suurem = 0;
        int k1vaiksem = 0;
        int k2suurem = 0;
        int k2vaiksem = 0;

        for (int i = 0; i < kraadid1.length; i++){
            if (kraadid1[i] >= ref){
                k1suurem++;

            }
            else k1vaiksem++;
        }
        int k1rohkem = k1suurem-k1vaiksem;
        int k2rohkem = k2suurem-k2vaiksem;
        if (k1rohkem>0){
            System.out.println(k1rohkem + " positiivset tempi on esimseses kogus rohkem kui negatiivset");
        }
        else System.out.println("Pluss kraade pole esimeses kogus rohkem");
        if (k2rohkem>0){
            System.out.println(k2rohkem + " positiivset tempi on teises kogus rohkem kui negatiivset");
        }
        else System.out.println("Pluss kraade pole teises kogus rohkem");
    }
}
