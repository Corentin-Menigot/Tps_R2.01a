package jeu;

import java.util.ArrayList;

/**
 *
 * @author fbm rev hb
 */
public class ChateauUtilitaire {

    // METHODES D'AFFICHAGE

    /**
     *
     * Affiche les informations de guerriers d'une liste de guerriers donnée,
     * un guerrier par ligne
     *
     * @param listeGuerriers -> la liste des guerriers à afficher
     */
    public static void printListeGuerriers(ArrayList<Guerrier> listeGuerriers) {
        for (int i = 0; i < listeGuerriers.size(); i++) {
            //appelle la méthode printUnite pour afficher un guerrier
            GuerrierUtilitaire.printlnUnite(listeGuerriers.get(i));
        }
        System.out.println("-----------------------------------------\n");
    }

    /**
     *
     * Affiche les informations de guerriers d'un chateau donné,
     * un guerrier par ligne
     *
     * @param chateau -> le chateau duquel on affiche les guerriers novices
     */
  	public static void printChateauGuerriers(Chateau chateau) {
        System.out.println("Guerriers du chateau (dans l'ordre d'entrainement) : ");
        ArrayList<Guerrier> listeGuerriers = chateau.getGuerrierNovice();
        //appelle la méthode printListeGuerrier pour afficher la liste des guerriers réupérés du chateau
        printListeGuerriers(listeGuerriers);
    }
}
