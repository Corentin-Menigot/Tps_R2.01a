package jeu;


/**
 * Classe qui permet de regrouper des méthodes relatives à tous types de
 * guerriers
 *
 * @author fbm
 */
public class GuerrierUtilitaire {

    //////////////////////////////////
    // METHODES D'AFFICHAGE
    public static void printUnite(Guerrier unite) {
        System.out.print("("+unite.getClass().getSimpleName()+") [PV: "+unite.getPointDeVie()+"] [Force "+unite.getForce()+"]");
    }

    public static void printlnUnite(Guerrier unite) {
        System.out.println("("+unite.getClass().getSimpleName()+") [PV: "+unite.getPointDeVie()+"] [Force "+unite.getForce()+"]");
    }

    public static void printlnCombat(Guerrier unite1, Guerrier unite2) {
        printUnite(unite1);
        System.out.print(" attaque ");
        printlnUnite(unite2);
    }
    
    // A COMPLETER : d'autres méthodes d'affichage si vous le souhaitez
}