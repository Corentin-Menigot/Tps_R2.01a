package jeu;

/**
 *
 * @author fbm
 */
public abstract class Guerrier {
    //attributs de la classe Guerrier
    private final int FORCE_DE_BASE = 10;
    private final int PV_MAX_DE_BASE = 100;
    private final int RESSOURCE_BASE = 1;
    private int pointsDeVie;
    private Chateau chateau;
    private Couleur couleur;

    //constructeurs de la classe Guerrier

    /**
     *
     * Constructeur de la classe
     *
     */
    Guerrier() {
        setPointDeVie(PV_MAX_DE_BASE);
    }

    //getters de la classe Guerrier

    /**
     *
     * Méthode qui renvoit la force d'un guerrier
     *
     * @return la force d'un guerrier (selon la classe héritante)
     */
    public int getForce() {return this.FORCE_DE_BASE;}

    /**
     *
     * Méthode qui renvoit les points de vie actuels d'un guerrier
     *
     * @return l'attribut point de vie du guerrier
     */
    public int getPointDeVie() { return this.pointsDeVie;}

    /**
     *
     * Méthode qui renvoit les ressources nécessaires à l'entrainement d'un guerrier (selon la classe héritante
     *
     * @return l'attribut ressource du guerrier
     */
    public int getRessourcesPourEntrainement() { return this.RESSOURCE_BASE ;}

    /**
     *
     * Méthode qui renvoit la couleur d'un guerrier
     *
     * @return l'attribut couleur du guerrier
     */
    public Couleur getCouleur() { return this.couleur ;}

    //méthodes de la classe Guerrier

    /**
     *
     * Méthode qui change l'attribut pointDeVie d'un guerrier.
     * Si la nouvelle valeur est inférieur à 0 on change l'attribut en 0 par défaut
     *
     * @param pointDeVie -> entier qui remplace la valeur actuelle des points de vie du guerrier
     */
    private void setPointDeVie(int pointDeVie) {
        //un guerrier ne peut pas avoir des points de vie négatif, on vérifit donc que la nouvelle valeur est supérieur à 0
        if (pointDeVie<0) {
            this.pointsDeVie=0;
        } else {
            this.pointsDeVie=pointDeVie;
        }
    }

    /**
     *
     * Méthode qui change l'attribut chateau d'un guerrier et attribut au guerrier la couleur de ce chateau
     *
     * @param chateau -> chateau auquel appartient le guerrier et qu'on luit attribut
     */
    public void setChateau(Chateau chateau) {
        this.chateau = chateau;
        this.couleur = this.chateau.getCouleur();
    }

    /**
     *
     * Méthode qui renvoit si un guerrier est vivant ou non, donc si il posséde plus de 0 points de vie
     *
     * @return vrai si le guerrier est en vie (pdv > 0) faux si il est mort (pdv <= 0)
     */
    public boolean estVivant() { return this.pointsDeVie>0;}

    /**
     *
     * Méthode qui retourne si le guerrier est de couleur bleu ou non
     *
     * @return vrai si le guerrier a pour couleur Bleu, faux sinon
     */
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}

    /**
     *
     * Méthode qui retourne si le guerrier est de couleur rouge ou non
     *
     * @return vrai si le guerrier a pour couleur Rouge, faux sinon
     */
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}

    /**
     *
     * Méthode qui permet d'attaquer un autre guerrier avec le guerrier qui utilise la méthode.
     * Les dégats infligés sont déduis des points de vie du guerrier attaqué. Les dégats sont calculés
     * grace à la force du guerrier et un jeté de dé
     *
     * @param guerrier -> le guerrier qui est attaqué par ce guerrier (this)
     */
    public void attaquer(Guerrier guerrier) {
        int degats=PlateauUtilitaire.De3(this.getForce());
        System.out.println("Dégats infligés: "+degats);
        guerrier.subirDegats(degats);
    }

    /**
     *
     * Méthode qui réduit les points de vie d'un guerrier
     *
     * @param degats -> la valeur qui sera soustraite aux points de vie du guerrier actuel (this)
     */
    protected void subirDegats(int degats) { setPointDeVie(this.pointsDeVie-degats);}
}
