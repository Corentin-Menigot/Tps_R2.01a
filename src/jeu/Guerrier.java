package jeu;

import jdk.jshell.execution.Util;

public abstract class Guerrier {
    //attributs de la classe Guerrier
    private int force;
    private int pointsDeVie;

    //constructeurs de la classe Guerrier
    Guerrier() { this.force=10; this.pointsDeVie=100;}

    //getters de la classe Guerrier
    public int getForce() {return this.force;}
    public int getPointDeVie() { return this.pointsDeVie;}

    //méthodes de la classe Guerrier
    private void setPointDeVie(int pointDeVie) {
        if (pointDeVie<0) {
            this.pointsDeVie=0;
        } else {
            this.pointsDeVie=pointDeVie;
        }
    }

    public boolean estVivant() { return this.pointsDeVie>0;}

    public void attaquer(Guerrier guerrier) {
        int degats=PlateauUtilitaire.De3(this.getForce());
        System.out.println("Dégats infligés: "+degats);
        guerrier.subirDegats(degats);
    }
    protected void subirDegats(int degats) { setPointDeVie(this.pointsDeVie-degats);}
}
