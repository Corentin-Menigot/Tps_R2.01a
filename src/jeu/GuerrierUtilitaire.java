package jeu;


/**
 * Classe qui permet de regrouper des méthodes relatives à tous types de
 * guerriers
 *
 * @author fbm
 */
public class GuerrierUtilitaire {

    // METHODES D'AFFICHAGE

    /**
     *
     * Méthode qui affiche les informations d'un guerrier sans sauter de ligne après
     *
     * @param unite -> Guerrier dont on affiche les informations
     */
    public static void printUnite(Guerrier unite) {
        System.out.print("("+unite.getClass().getSimpleName()+") [PV: "+unite.getPointDeVie()+"] [Force "+unite.getForce()+"]");
    }

    /**
     *
     * Méthode qui affiche les informations d'un guerrier en sautant une ligne après
     *
     * @param unite -> Guerrier dont on affiche les informations
     */
    public static void printlnUnite(Guerrier unite) {
        System.out.println("("+unite.getClass().getSimpleName()+") [PV: "+unite.getPointDeVie()+"] [Force "+unite.getForce()+"]");
    }

    /**
     *
     * Méthode qui affiche un combat ou unite1 attaque unite2
     *
     * @param unite1 -> guerrier qui attaque
     * @param unite2 -> guerrier attaqué
     */
    public static void printlnCombat(Guerrier unite1, Guerrier unite2) {
        printUnite(unite1);
        System.out.print(" attaque ");
        printlnUnite(unite2);
    }
}