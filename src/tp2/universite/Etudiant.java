package tp2.universite;

import tp2.contraintes.Note;

import java.util.ArrayList;
import java.util.Comparator;

public class Etudiant extends Personne implements Comparable<Etudiant>{
    //attributs de la classe Etudiant
    private String adresseParent;
    private ArrayList<Note> notes;
    private Groupe groupe;

    //constructeurs de la classe Etudiant
    public Etudiant(String login, String prenom, String nom) {
        super(login, prenom, nom);
        this.notes = new ArrayList<>();
    }
    Etudiant(String login, String prenom, String nom, String adresse, String adresseParent) {
        super(login, prenom, nom);
        setAdresse(adresse, adresseParent);
        this.notes = new ArrayList<>();
    }
    //setters de la classe Etudiant
    public void setAdresse(String adresse, String adresseParent) {
        super.setAdresse(adresse);
        this.adresseParent=adresseParent;
    }
    public void setGroupe(Groupe groupe) {
        if (this.groupe != groupe & this.groupe != null & groupe != null) {
            this.groupe.removeEtudiant(this);
        }
        this.groupe = groupe;
        if (groupe != null && !this.groupe.containsEtudiant(this)) {
            this.groupe.addEtudiant(this);
        }
    }

    //méthodes de la classe Etudiant
    public void addNote(Note note) {
        this.notes.add(note);
    }
    public double getMoyenne() {
        double moyenne = 0;
        for (int i=0; i<this.notes.size(); i++) {
            moyenne = moyenne+this.notes.get(i).getValeur();
        }
        return moyenne/notes.size();
    }
    public Groupe getGroupe() { return this.groupe;}
    public boolean existGroupe() {
        return groupe!=null;
    }
    public boolean isContainedGroupe(Groupe groupe) {
        if (existGroupe()) {
            return this.groupe == groupe;
        } else {
            return false;
        }
    }
    @Override
    public String getMail() { return getPrenom()+"."+getNom()+"@etu.univ-grenoble-alpes.fr";}
    @Override
    public boolean existAdresse() { return super.existAdresse() | adresseParent!=null ;}
    @Override
    public String getAdresse() {
        if (existAdresse()) {
            if (super.existAdresse() & adresseParent!=null) {
                return super.getAdresse()+" (Adresse des parents "+adresseParent+")";
            } else if (super.existAdresse()) {
                return super.getAdresse();
            } else {
                return "Adresse des parents "+adresseParent;
            }
        } else {
            return "Pas d'adresse";
        }
    }
    @Override
    public int compareTo(Etudiant etudiant) {
        if (this.getNom().compareTo(etudiant.getNom())<0 |
                (this.getNom().equals(etudiant.getNom()) & this.getPrenom().compareTo(etudiant.getPrenom())<0)) {
            return -1;
        } else if (this.getNom().equals(etudiant.getNom()) & this.getPrenom().equals(etudiant.getPrenom())) {
            return 0;
        } else {
            return 1;
        }
    }
}

