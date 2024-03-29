package tp4.dalton;

import java.util.Comparator;

public class Dalton implements Comparable<Dalton> {
    //attributs
    private String nom;
    private Taille taille;

    //constructeur
    public Dalton (String nom, Taille taille) {
        this.nom = nom;
        this.taille = taille;
    }

    //methodes
    public String getNom () { return this.nom;}
    public Taille getTaille () { return this.taille;}

    @Override
    public int compareTo(Dalton dalton) {
        if (this.taille.compareTo(dalton.taille)<0 || (this.taille == dalton.taille && this.nom.compareTo(dalton.nom)<0)) {
            return -1;
        } else if (this.nom.equals(dalton.nom) && this.taille == dalton.taille) {
            return 0;
        } else {
            return 1;
        }
    }
    @Override
    public String toString() {
        return this.nom+" ("+this.getTaille()+")";
    }
}
