package tp1.universite;

public class Etudiant {

    //attributs de la classe Etudiant
    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    private double[] notes= new double[5];
    private int nbNote=0;
    private Groupe groupe;

    //constructeur de la classe Etudiant
    Etudiant(String login, String prenom, String nom){
        setLogin(login);
        setPrenom(prenom);
        setNom(nom);
    }

    //accesseurs de la classe Etudiant
    public String getLogin() {
        return login;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNomComplet() {
        return prenom+" "+nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getMail() {return prenom+"."+nom+"@etu.univ-Grenoble-alpes.fr";}
    public int getNbNote() {return nbNote;}
    public double[] getNotes() {return notes;}
    public Groupe getGroupe() {return groupe;}

    /**
     * calcule la moyenne des notes de l'élève
     * @return moyenne des notes de l'élève
     */
    public double getMoyenne() {
        double moy=0;
        for (int i=0; i<nbNote; i++) {
            moy= moy+(notes[i]/nbNote);
        }
        return moy;
    }



    //méthodes de la classe Etudiant

    /**
     *  Vérifie si existence d'une adresse pour l'étudiant
     *
     * @return true si l'étudiant a une adresse, false sinon
     */
    public boolean existAdresse() {
        return adresse!=null;
    }
    /**
     *  Vérifie si existence de notes pour l'étudiant
     *
     * @return true si l'étudiant a au moins une note, false sinon
     */
    public boolean existNotes() {
        return nbNote!=0;
    }
    /**
     *  Vérifie si existence d'un groupe pour l'étudiant
     *
     * @return true si l'étudiant a un groupe, false sinon
     */
    public boolean existGroupe() {
        return groupe!=null;
    }
    public void setLogin(String login) {
        this.login=login.toLowerCase();
    }
    public void setNom(String nom) {
        this.nom=EtudiantUtilitaire.capitalize(nom);
    }
    public void setPrenom(String prenom) {
        this.prenom=EtudiantUtilitaire.capitalize(prenom);
    }
    public void setAdresse(String adresse) {
        this.adresse=adresse;
    }
    public void setGroupe(Groupe groupe) {
        this.groupe=groupe;
    }

    /**
     * ajoute une note à l'élève si il n'en a pas déjà 5, sinon on renvoit un message pour dire qu'il est impossible de rajouter une note
     * et incrémente nbNotes pour correspondre au nombre de notes
     *
     * @param note
     */
    public void addNote(double note) {
        if (nbNote<notes.length) {
            // on vérifie que l'élève peut encore recevoir des notes
            this.notes[nbNote]= note;
        } else {
            System.out.println("On ne peut pas entrer plus de notes");
        }
        this.nbNote++;
    }
}
