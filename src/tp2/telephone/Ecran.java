package tp2.telephone;

public class Ecran {
    //attributs de la classe Ecran
    private String type;
    private int taille;

    //constructeur de la classe Ecran
    public Ecran(String type, int taille) {
        this.type=type;
        this.taille=taille;
    }

    //méthodes de la classe Ecran
    public String getType() { return this.type;}
    public int getTaille() { return this.taille;}
}
