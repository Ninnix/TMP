package Lezione08.Pac2;

import Lezione08.Pac1.*;

/**
 * Created by nikyw on 17/03/2017.
 */
public class Gatto extends Vertebrato {

    public Gatto (int vertebre, boolean vola) {
        super(vertebre, vola);
    }

    public void stampaGatto () {

        System.out.print("questo gatto ha " + vertebre + " vertebre e...");
        // quello che segue funziona se vola e' public o protected, *non* se default!
        // System.out.println((vola? " " : " non ") + "vola");
    }

    public static void main(String[] args) { // crea un gatto e lo stampa

        Gatto G = new Gatto(30, false);
        G.stampaGatto();

    }

}