package jeu;


import tp2.universite.UniversiteUtilitaire;

/**
 *
 * @author fbm
 */
public class TestJeuEtape1 {

    public static void main(String[] args) {
        
        // etape 1 : tester les méthodes de bases;
        // etape 4 : tester les affichages
        // étape 5 : tester les combats
        
        // A COMPLETER : Création d'un objet nain de type Nain puis afficher les caractéristiques du guerrier crée
        Nain nain = new Nain(new Chateau(Couleur.Bleu));
        GuerrierUtilitaire.printlnUnite(nain);
   
        // A COMPLETER : Création d'un objet elfe de type Elfe puis afficher les caractéristiques du guerrier crée
        Elfe elfe = new Elfe(new Chateau(Couleur.Rouge));
        GuerrierUtilitaire.printlnUnite(elfe);
    
        // A COMPLETER : Création d'un objet chefNain de type ChefNain puis afficher les caractéristiques du guerrier crée
        ChefNain chefNain = new ChefNain(new Chateau(Couleur.Bleu));
        GuerrierUtilitaire.printlnUnite(chefNain);

        // A COMPLETER : Création d'un objet chefElfe de type ChefElfe puis afficher les caractéristiques du guerrier crée
        ChefElfe chefElfe = new ChefElfe(new Chateau(Couleur.Rouge));
        GuerrierUtilitaire.printlnUnite(chefElfe);

        // A COMPLETER : nain attaque elfe (afficher le combat)
        GuerrierUtilitaire.printlnCombat(nain, elfe);

        // A COMPLETER : elfe attaque nain (afficher le combat)
        GuerrierUtilitaire.printlnCombat(elfe, nain);

        // A COMPLETER : chefNain attaque chefElfe (afficher le combat)
        GuerrierUtilitaire.printlnCombat(chefNain, chefElfe);
        
        // A COMPLETER : chefElfe attaque chefNain (afficher le combat)
        GuerrierUtilitaire.printlnCombat(chefElfe, chefNain);
        
        // A COMPLETER : Simuler un combat (itération attaque/dégat entre deux guerriers jusqu'à la mort de l'un d'eux)
        while (elfe.estVivant() && nain.estVivant()) {
            GuerrierUtilitaire.printlnCombat(nain, elfe);
            nain.attaquer(elfe);
            if (elfe.estVivant()) {
                GuerrierUtilitaire.printlnCombat(elfe, nain);
                elfe.attaquer(nain);
            }
        }
        if (elfe.estVivant()) {
            System.out.println(nain.getClass().getSimpleName()+" est mort");
        } else {
            System.out.println(elfe.getClass().getSimpleName()+" est mort");
        }

    }
}
