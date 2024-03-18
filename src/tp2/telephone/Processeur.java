package tp2.telephone;

public class Processeur {
    //attributs de la classe Processeur
    private String libelle;
    private double frequence;

    //constructeur de la classe Processeur
    public Processeur(String libelle, double frequence) {
        this.libelle=libelle;
        this.frequence=frequence;
    }

    //méthodes de la classe Processeur
    public String getLibelle() { return this.libelle;}
    public double getFrequence() { return this.frequence;}
}
