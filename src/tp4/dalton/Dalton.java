package tp4.dalton;

public class Dalton {
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
}
