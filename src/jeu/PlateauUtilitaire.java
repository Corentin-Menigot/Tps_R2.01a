package jeu;

import java.util.Random;

/**
 *
 * @author fbm rev hb
 */
public class PlateauUtilitaire {

    private static final Random RANDOM = new Random();

    // nombre de cases des différents plateaux
    /**
     *
     * lancé d'un dé trois faces
     *
     * @return un entier entre 1 et 3
     */
    public static int De3() {
        return RANDOM.nextInt(3)+1;
    }

    /**
     *
     * On lance un dé 3 face le nombre de fois de nombreLances
     *
     * @param nombreLances
     * @return la somme des nombresLances lancés d'un dé 3
     */
    public static int De3(int nombreLances) {
        int somme = 0;
        for (int i = 0; i < nombreLances; i++) {
            //on ajoute à chaque lancé le résultat à la somme des autres lancés
            somme = somme + De3();
        }
        return somme;
    }

    // AFFICHAGE
    
    /**
     * Affichage des Guerriers sur chaque Carreaux du plateau
     * @param plateau
     */
    
    /**
     * Affichage de l'équipe gagnante
     * @param plateau
     */
    

    /**
     * Affichage de tous les Guerriers d'un Carreau
     * @param carreau
     */
    
}
