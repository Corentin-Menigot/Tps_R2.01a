package jeu;

import tp5.TestLogging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Chateau {
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());
    // Configuration du logger
    // Récupérarion du gestionnaire de logs.
    private static final LogManager logManager = LogManager.getLogManager();
    // Configuration du logger
    // EditConfiguration > Modify options > add VM options :
    // -Djava.util.logging.config.file=conf/debug-logging.properties
    static{
        try {
            logManager.readConfiguration( new FileInputStream("conf/debuglogging.properties") );
        } catch ( IOException exception ) {
            LOGGER.log( Level.SEVERE, "Cannot read configuration file", exception );
        }
    }
    //attributs de la classe chateau

    //ressources du chateau en début de partie
    private final int RESSOURCES_INITIAL = 3;

    //ressources ajoutées au chateau à chaque tour
    private final int RESSOURCE_AJOUTEE_PAR_TOUR = 1;
    private int ressources;

    //liste des guerriers non entrainés dans le chateau, dans l'ordre de leur entrainement
    private ArrayList<Guerrier> guerriersNovices;
    private Couleur couleur;

    //constructeur
    /**
     *
     * Constructeur de la classe Chateau
     *
     * @param couleur -> la couleur qu'on attribue au chateau
     */
    public Chateau(Couleur couleur) {
        this.ressources = this.RESSOURCES_INITIAL;
        this.couleur = couleur;
        this.guerriersNovices = new ArrayList<>();
        LOGGER.log(Level.INFO, "Création d'un chateau de couleur "+this.couleur);
    }

    /**
     *
     * Méthode qui ajoute un guerrier novice (à entrainer)
     * à la fin de la file d'attente du chateau
     *
     * @param guerrier -> le guerrier novice qu'on ajoute
     */
    public void ajoutGuerrierNovice(Guerrier guerrier) {
        this.guerriersNovices.add(guerrier);
        guerrier.setChateau(this);
        LOGGER.log(Level.INFO, "Ajout d'un "+guerrier.getClass().getSimpleName()+" au chateau");
    }

    /**
     *
     * Méthode qui renvoit la liste des guerriers novices du chateau
     *
     * @return la liste des guerriers novices (non entrainés) du chateau
     */
    public ArrayList<Guerrier> getGuerrierNovice() {
        return this.guerriersNovices;
    }


    /**
     *
     * Méthode qui entraine les guerriers novices (dans l'ordre du premier au dernier de la liste)
     * et notifie via des loggers si l'entrainement et complet ou partiel. Si l'entrainement est partiel
     * on notifie le nombre de ressources manquantes et il se poursuivra au tour suivant si possible
     * (on attend d'avoir les ressources totales nécessaire pour entrainer un guerrier)
     *
     * @return la liste des guerriers qu'on a pu entrainer avec les ressources du chateau à ce tour
     */
    public ArrayList<Guerrier> entrainer() {
        ArrayList<Guerrier> guerriersEntraines = new ArrayList<>();
        //on boucle sur le premier Guerrier de la liste des guerriers novices tant qu'il y en a un ou qu'il reste assez de ressources pour l'entrainer
        while (!this.guerriersNovices.isEmpty() && this.ressources >= this.guerriersNovices.get(0).getRessourcesPourEntrainement()) {
            //on ajoute au guerriers entrainés le premier guerrier de la liste, on decrémente les ressources du chateau
            //de son cout d'entrainement et on le supprime des guerriers novices
                guerriersEntraines.add(this.guerriersNovices.get(0));
                this.ressources = this.ressources - this.guerriersNovices.get(0).getRessourcesPourEntrainement();
                LOGGER.log(Level.INFO, "Entrainement complet de "+this.guerriersNovices.get(0).getClass().getSimpleName());
                this.guerriersNovices.remove(0);
            }
        if (this.ressources > 0) {
            //logger pour préciser que l'entrainement est partiel et le nombre de ressources manquantes, l'entrainement sera géré au tour suivant si possible
            LOGGER.log(Level.INFO, "Entrainement partiel de "+this.guerriersNovices.get(0).getClass().getSimpleName()+", ressources manquantes: "+
                    (this.guerriersNovices.get(0).getRessourcesPourEntrainement()-this.ressources));
        }
        LOGGER.log(Level.INFO, "Plus d'entrainements possible ce tour");
        //incrémentation des ressources pour simuler une fin de tour comme précise dans TestJeuEtape2
        this.incrementerRessources();
        return guerriersEntraines;
    }
    //rajouter logger pour dire entrainement de quoi + si entrainement complet/partiel + ressources dépensés

    /**
     *
     * Méthode qui incrémente les ressources du chateau du
     * nombre de ressources qu'on ajoute à chaque tour
     *
     */
    private void incrementerRessources() {
        this.ressources = this.ressources + this.RESSOURCE_AJOUTEE_PAR_TOUR;
        LOGGER.log(Level.INFO, "Ajout de "+this.RESSOURCE_AJOUTEE_PAR_TOUR+" de ressources au chateau");
    }

    /**
     *
     * Méthode qui retourne la couleur du chateau
     *
     * @return la couleur du chateau
     */
    public Couleur getCouleur() { return this.couleur ;}

    /**
     *
     * Méthode qui retourne si le chateau est de couleur bleu ou non
     *
     * @return vrai si le chateau a pour couleur Bleu, faux sinon
     */
    public boolean estBleu() { return this.couleur == Couleur.Bleu;}

    /**
     *
     * Méthode qui retourne si le chateau est de couleur rouge ou non
     *
     * @return vrai si le chateau a pour couleur Rouge, faux sinon
     */
    public boolean estRouge() { return this.couleur == Couleur.Rouge;}
}
