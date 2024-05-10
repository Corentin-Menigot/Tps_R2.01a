package jeu;

import java.util.HashSet;

public class Chateau {
    //attributs de la classe chateau
    private final int RESSURCES_INITIAL = 3;
    private final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private int ressources;
    private HashSet<Guerrier> guerriersNovices;
    private Couleur couleur;

    //constructeur
    public Chateau(Couleur couleur) {
        this.ressources = this.RESSURCES_INITIAL;
        this.couleur = couleur;
    }
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        this.guerriersNovices.add(guerrier);
    }
    public HashSet<Guerrier> getGuerrierNovice() {
        return this.guerriersNovices;
    }
    public HashSet<Guerrier> entrainer() {
        HashSet<Guerrier> guerriersEntrainer = new HashSet<>();
        for (int i = 0; i < this.guerriersNovices.size(); i++) {
            if (this.guerriersNovices.)
        }
    }
    private void incrementerRessources() {
        this.ressources = this.ressources + this.RESSOURCE_AJOUTEE_PAR_TOUR;
    }
    public Couleur getCouleur() { return this.couleur ;}
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}
}
