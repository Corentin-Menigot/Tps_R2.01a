package jeu;

import java.util.HashSet;
import java.util.Iterator;

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
        this.guerriersNovices = new HashSet<>();
    }
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        this.guerriersNovices.add(guerrier);
    }
    public HashSet<Guerrier> getGuerrierNovice() {
        return this.guerriersNovices;
    }
    public HashSet<Guerrier> entrainer() {
        HashSet<Guerrier> guerriersEntrainer = this.guerriersNovices;
        for (Iterator<Guerrier> iterator = guerriersEntrainer.iterator(); iterator.hasNext();) {
            if (iterator.next().getClass().equals(Guerrier.class)) {
                iterator.remove();
            }
        }
        return guerriersEntrainer;
    }
    private void incrementerRessources() {
        this.ressources = this.ressources + this.RESSOURCE_AJOUTEE_PAR_TOUR;
    }
    public Couleur getCouleur() { return this.couleur ;}
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}
}
