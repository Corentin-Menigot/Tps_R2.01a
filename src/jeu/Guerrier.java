package jeu;

import jdk.jshell.execution.Util;

public abstract class Guerrier {
    //attributs de la classe Guerrier
    private final int FORCE_DE_BASE = 10;
    private final int PV_MAX_DE_BASE = 100;
    private final int RESSOURCE_BASE = 1;
    private int pointsDeVie;
    private Chateau chateau;
    private Couleur couleur;

    //constructeurs de la classe Guerrier
    Guerrier(Chateau chateau) {
        setPointDeVie(100);
        setChateau(chateau);
        this.couleur = this.chateau.getCouleur();
    }

    //getters de la classe Guerrier
    public int getForce() {return this.FORCE_DE_BASE;}
    public int getPointDeVie() { return this.pointsDeVie;}
    public int getRessourcesPourEntrainement() { return this.RESSOURCE_BASE ;}
    public Couleur getCouleur() { return this.couleur ;}

    //méthodes de la classe Guerrier
    private void setPointDeVie(int pointDeVie) {
        if (pointDeVie<0) {
            this.pointsDeVie=0;
        } else {
            this.pointsDeVie=pointDeVie;
        }
    }
    public void setChateau(Chateau chateau) { this.chateau = chateau;}

    public boolean estVivant() { return this.pointsDeVie>0;}
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}
    public void attaquer(Guerrier guerrier) {
        int degats=PlateauUtilitaire.De3(this.getForce());
        System.out.println("Dégats infligés: "+degats);
        guerrier.subirDegats(degats);
    }
    protected void subirDegats(int degats) { setPointDeVie(this.pointsDeVie-degats);}
}
