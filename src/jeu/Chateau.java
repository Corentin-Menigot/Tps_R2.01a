package jeu;

import java.util.ArrayList;

public class Chateau {
    //attributs de la classe chateau
    private final int RESSURCES_INITIAL = 3;
    private final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private int ressources;
    private ArrayList<Guerrier> guerriersNovices;
    private Couleur couleur;

    //constructeur
    public Chateau(Couleur couleur) {
        this.ressources = this.RESSURCES_INITIAL;
        this.couleur = couleur;
        this.guerriersNovices = new ArrayList<>();
    }
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        this.guerriersNovices.add(guerrier);
    }
    public ArrayList<Guerrier> getGuerrierNovice() {
        return this.guerriersNovices;
    }
    public ArrayList<Guerrier> entrainer() {
        ArrayList<Guerrier> guerriersEntraines = this.guerriersNovices;

        return guerriersEntraines
                ;
    }
    private void incrementerRessources() {
        this.ressources = this.ressources + this.RESSOURCE_AJOUTEE_PAR_TOUR;
    }
    public Couleur getCouleur() { return this.couleur ;}
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}
}
