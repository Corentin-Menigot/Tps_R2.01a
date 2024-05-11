package jeu;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author fbm rev hb
 */
public class ChateauUtilitaire {

    
    ///////////////////////
    // METHODES D'AFFICHAGE
  	public static void printChateauGuerriers(Chateau chateau) {
        System.out.println("Guerriers du chateau: ");
        ArrayList<Guerrier> guerriers = chateau.getGuerrierNovice();
        for (Iterator<Guerrier> it = guerriers.iterator(); it.hasNext();) {
            GuerrierUtilitaire.printUnite(it.next());
        }
    }
}
