package jeu;

public class TestEtape2 {
    public static void main(String[] args) {
        //création des guerriers
        Nain nain= new Nain();
        ChefNain chefNain= new ChefNain();
        Elfe elfe= new Elfe();
        ChefElfe chefElfe= new ChefElfe();
        int pv;

        //combat entre nain et elfe
        while (elfe.estVivant() && nain.estVivant()) {
            System.out.println("L'elfe attaque le nain:");
            pv= nain.getPointDeVie();
            elfe.attaquer(nain);
            System.out.print("Dégats subits: "+(pv-nain.getPointDeVie())+"\nnain: ");
            GuerrierUtilitaire.printUnite(nain);
            System.out.println("Le nain attaque l'elfe:");
            pv= elfe.getPointDeVie();
            nain.attaquer(elfe);
            System.out.print("Dégats subits: "+(pv-elfe.getPointDeVie())+"\nelfe: ");
            GuerrierUtilitaire.printUnite(elfe);
            System.out.println("|------------------------------------------------------|");
        }
        if (elfe.estVivant()) {
            System.out.println("Victoire de l'elfe");
        } else {
            System.out.println("Victoire du nain");
        }
        System.out.println("\n\n\n");

        //combat entre chef nain et chef elfe
        while (chefElfe.estVivant() && chefNain.estVivant()) {
            System.out.println("Le chef elfe attaque le chef nain:");
            pv= chefNain.getPointDeVie();
            chefElfe.attaquer(chefNain);
            System.out.print("Dégats subits: "+(pv-chefNain.getPointDeVie())+"\nchef nain: ");
            GuerrierUtilitaire.printUnite(chefNain);
            System.out.println("Le chef nain attaque le chef elfe:");
            pv= chefElfe.getPointDeVie();
            nain.attaquer(chefElfe);
            System.out.print("Dégats subits: "+(pv-chefElfe.getPointDeVie())+"\nchef elfe: ");
            GuerrierUtilitaire.printUnite(chefElfe);
            System.out.println("|------------------------------------------------------|");
        }
        if (elfe.estVivant()) {
            System.out.println("Victoire du chef elfe");
        } else {
            System.out.println("Victoire du chef nain");
        }
    }
}
