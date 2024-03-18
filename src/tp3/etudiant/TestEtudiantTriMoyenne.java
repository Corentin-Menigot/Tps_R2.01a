package tp3.etudiant;

import tp2.contraintes.Note;
import tp2.universite.Etudiant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class TestEtudiantTriMoyenne {
    private static void affichageEtudiantsMoyenne(Collection<Etudiant> etudiants) {
        for (Etudiant etudiant : etudiants) {
            System.out.println("Moyenne = "+etudiant.getMoyenne()+" : "+etudiant.getNom() + ", " + etudiant.getPrenom());
        }
    }

    public static void main(String[] args) {
        // Créer les étudiants
        Etudiant etudiant1= new Etudiant("sanzf","Floriant","Sanz");
        Etudiant etudiant2= new Etudiant("portep","Pierre-antoine","Porte");
        Etudiant etudiant3= new Etudiant("burlatn","Nils","Burlat");
        Etudiant etudiant4= new Etudiant("brunet-manquatr","Raphael","Brunet-manquat");
        Etudiant etudiant5= new Etudiant("brunet-manquatm","Maxime","Brunet-manquat");
        // Ajouter des notes aux étudiants
        etudiant1.addNote(new Note(16));
        etudiant2.addNote(new Note(9));
        etudiant3.addNote(new Note(13));
        etudiant4.addNote(new Note(19));
        etudiant5.addNote(new Note(18));
        // Créer la liste d'étudiants et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsTries = new ArrayList<>();
        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        mesEtudiantsTries.add(etudiant3);
        mesEtudiantsTries.add(etudiant4);
        mesEtudiantsTries.add(etudiant5);
        // Afficher la liste des étudiants avant tri
        affichageEtudiantsMoyenne(mesEtudiantsTries);
        // trier la liste
        Collections.sort(mesEtudiantsTries, new EtudiantCompMoyenne());
        // Afficher la liste des étudiants après tri
        System.out.println("===========================\n");
        affichageEtudiantsMoyenne(mesEtudiantsTries);
    }
}
