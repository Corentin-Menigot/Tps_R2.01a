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
        guerrier.setChateau(this);
    }
    public ArrayList<Guerrier> getGuerrierNovice() {
        return this.guerriersNovices;
    }
    public ArrayList<Guerrier> entrainer() {
        ArrayList<Guerrier> guerriersEntraines = this.guerriersNovices;
        int i = 0;
        while (!this.guerriersNovices.isEmpty() && this.ressources >= this.guerriersNovices.get(0).getRessourcesPourEntrainement()) {
            if (this.guerriersNovices.get(0).getRessourcesPourEntrainement() <= this.ressources) {
                guerriersEntraines.add(this.guerriersNovices.get(0));
                this.ressources = this.ressources - this.guerriersNovices.get(0).getRessourcesPourEntrainement();
                this.guerriersNovices.remove(0);
            } else {
                //logger pour préciser que l'entrainement est partiel et le nombre de ressources manquantes, l'entrainement sera géré au tour suivant si possible
            }
        }
        return guerriersEntraines;
    }
    //rajouter logger pour dire entrainement de quoi + si entrainement complet/partiel + ressources dépensés



    private void incrementerRessources() {
        this.ressources = this.ressources + this.RESSOURCE_AJOUTEE_PAR_TOUR;
    }
    public Couleur getCouleur() { return this.couleur ;}
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}
}
