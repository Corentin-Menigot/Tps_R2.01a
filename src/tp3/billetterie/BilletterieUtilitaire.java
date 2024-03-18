package tp3.billetterie;

import java.util.ArrayList;

public class BilletterieUtilitaire {
    public static double arrondir(double prix) {
        return Math.round(prix*100)*0.01;
    }

    public static void afficheTrajets(ArrayList<Trajet> trajets) {
        System.out.println();
        System.out.println("---------Les trajets---------");
        for (int i=0; i<trajets.size(); i++) {
            System.out.println(trajets.get(i));
        }
    }

    public static void afficheBillets(ArrayList<Billet> billets) {
        System.out.println();
        System.out.println("---------Les billets---------");
        for (int i=0; i<billets.size(); i++) {
            System.out.println(billets.get(i));
        }
    }
}

