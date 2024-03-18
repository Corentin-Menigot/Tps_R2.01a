package tp2.universite;

import java.util.Collection;
import java.util.TreeSet;

public class Groupe {

    //attributs de la classe Groupe
    private String libelle;
    private TreeSet<Etudiant> etudiants = new TreeSet<>();

    //constructeur de la classe groupe
    public Groupe(String libelle) {
        this.libelle=libelle;
    }

    //getters de la classe Groupe
    public String getLibelle() {return this.libelle;}
    public Collection<Etudiant> getEtudiants() { return this.etudiants;}

    //méthodes de la classe Groupe
    public void setLibelle(String libelle) {
        this.libelle=libelle;
    }
    public void addEtudiant(Etudiant etudiant) {
        etudiant.setGroupe(this);
    }
    public void removeEtudiant(Etudiant etudiant) {
        if(containsEtudiant(etudiant)) {
            this.etudiants.remove(etudiant);
        }
        etudiant.setGroupe(null);

    }
    public boolean containsEtudiant(Etudiant etudiant) {
        return etudiant.getGroupe()==this;
    }
}