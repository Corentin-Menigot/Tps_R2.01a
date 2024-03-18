package tp2.universite;

import tp2.contraintes.ReelContraint;

public class Personnel extends Personne {
    //attributs de la classe Personnel
    public static final int ECHELON_MIN = 1;
    public static final int ECHELON_MAX = 4;
    public static final double INDICE_MIN = 1000;
    public static final double INDICE_MAX = 1200;
    private int echelon;
    private ReelContraint pointIndice;

    //constructeurs de la classe Personnel
    Personnel(String login, String prenom, String nom) {
        super(login, prenom, nom);
        this.echelon=ECHELON_MIN;
        setPointDIndice(INDICE_MIN);
    }
    Personnel(String login, String prenom, String nom, int echelon, double pointDIndice) {
        super(login, prenom, nom);
        setEchelon(echelon);
        setPointDIndice(pointDIndice);
    }

    //setters de la classe Personnel
    public void setEchelon(int echelon) {
        if (echelon<ECHELON_MIN) {
            this.echelon=ECHELON_MIN;
        } else if (echelon>ECHELON_MAX) {
            this.echelon=ECHELON_MAX;
        } else {
            this.echelon=echelon;
        }
    }
    public void setPointDIndice(double pointIndice) {
        this.pointIndice= new ReelContraint(INDICE_MIN, INDICE_MAX);
        this.pointIndice.setValeur(pointIndice);
    }

    //méthodes de la classe Personnel
    public int getEchelon() { return this.echelon;}
    public double getPointIndice() { return this.pointIndice.getValeur();}
    public double getSalaire() { return this.echelon*this.pointIndice.getValeur();}
    public String getMail() { return getPrenom()+"."+getNom()+"@univ-grenoble-alpes.fr";}
}