package main;

import java.util.Random;

public class Jatekos {
    /* ADATTAGOK */
    Random rnd = new Random();
    int tipp;
    
    /* TAGFÜGGVÉNYEK */
    void tippel(){
        tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
}
