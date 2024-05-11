package jeu;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author fbm
 */
public class TestJeuEtape2 {

    public static void main(String[] args) {
        
        // étape 2 : tester les méthodes de bases
        // étape 4 : tester les affichages
        // étape 5 : tester l'entrainement 
        
        //Création d'un objet chateau
        Chateau chateau1 = new Chateau(Couleur.Bleu);

        //Ajouter les guerriers au chateau
        chateau1.ajoutGuerrierNovice(new Nain());
        chateau1.ajoutGuerrierNovice(new Nain());
        chateau1.ajoutGuerrierNovice(new Elfe());
        chateau1.ajoutGuerrierNovice(new Elfe());
        chateau1.ajoutGuerrierNovice(new ChefElfe());

        //Afficher les guerriers contenu dans le chateau (dans l'ordre d'entrainement)
        ChateauUtilitaire.printChateauGuerriers(chateau1);

        //Réaliser un premier entrainement puis afficher les guerriers prets aux combats
        ArrayList<Guerrier> guerriersEntraines = new ArrayList<>();
        guerriersEntraines = chateau1.entrainer();
        System.out.println("Liste des guerriers entrainés au tour 1 : ");
        ChateauUtilitaire.printListeGuerriers(guerriersEntraines);
        
        //Incrementer les ressources dans un chateau (simuler la fin d'un tour et donc l'ajout de ressources supplémentaires)
        // dans notre cas l'incrémentation se fait directement dans la méthode entrainement
        
        //Réaliser un deuxième entrainement puis afficher les guerriers prets aux combats
        guerriersEntraines = chateau1.entrainer();
        System.out.println("Liste des guerriers entrainés au tour 2 : ");
        ChateauUtilitaire.printListeGuerriers(guerriersEntraines);
        
        //Réaliser une itération pour simuler 10 tours : entrainement, affichage des guerriers prets et incrementation des ressources
        // N'hésitez pas à rajouter des guerriers au chateau pour tester votre chateau
        chateau1.ajoutGuerrierNovice(new ChefNain());
        chateau1.ajoutGuerrierNovice(new Nain());
        chateau1.ajoutGuerrierNovice(new Elfe());
        chateau1.ajoutGuerrierNovice(new Elfe());
        chateau1.ajoutGuerrierNovice(new Nain());
        chateau1.ajoutGuerrierNovice(new Nain());
        chateau1.ajoutGuerrierNovice(new ChefElfe());

        for (int i = 3; i < 13; i++) {
            guerriersEntraines = chateau1.entrainer();
            System.out.println("Liste des guerriers entrainés au tour "+i+" : ");
            ChateauUtilitaire.printListeGuerriers(guerriersEntraines);
        }
        
    }
}
