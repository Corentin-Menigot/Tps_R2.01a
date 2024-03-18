package tp2.contraintes;

import java.util.Scanner;

public class ContrainteUtilitaire {
    public static ReelContraint saisir(double min, double max){
        ReelContraint contrainte  = new ReelContraint(min, max);
        double valeur;
        Scanner lecteur = new Scanner(System.in);
        do {
            System.out.println("Entrez un valeur entre "+min+" et "+max);
            valeur = lecteur.nextDouble();
            lecteur.nextLine();
        } while (valeur<min | valeur>max);
        contrainte.setValeur(valeur);
        return contrainte;
    }

    public static Note saisir() {
        Note note = new Note();
        double valeur;
        Scanner lecteur = new Scanner(System.in);
        do {
            System.out.println("Entrez un valeur entre "+0+" et "+20);
            valeur = lecteur.nextDouble();
            lecteur.nextLine();
        } while (valeur<0 | valeur>20);
        note.setValeur(valeur);
        note.setValeur(valeur);
        return note;
    }
}
