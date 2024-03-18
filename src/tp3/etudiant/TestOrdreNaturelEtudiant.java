package tp3.etudiant;

import tp2.contraintes.Note;
import tp2.universite.Etudiant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class TestOrdreNaturelEtudiant {
    private static void affichageEtudiants(Collection<Etudiant> etudiants) {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + ", " + etudiant.getPrenom());
        }
    }

    public static void main(String[] args) {
        // Créer les étudiants
        Etudiant etudiant1= new Etudiant("sanzf","Floriant","Sanz");
        Etudiant etudiant2= new Etudiant("portep","Pierre-antoine","Porte");
        Etudiant etudiant3= new Etudiant("burlatn","Nils","Burlat");
        Etudiant etudiant4= new Etudiant("brunet-manquatr","Raphael","Brunet-manquat");
        Etudiant etudiant5= new Etudiant("brunet-manquatm","Maxime","Brunet-manquat");
        // Créer la liste d'étudiants quelconque et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();
        mesEtudiantsOrdreQcq.add(etudiant1);
        mesEtudiantsOrdreQcq.add(etudiant2);
        mesEtudiantsOrdreQcq.add(etudiant3);
        mesEtudiantsOrdreQcq.add(etudiant4);
        mesEtudiantsOrdreQcq.add(etudiant5);
        // Afficher la liste d'étudiants quelconque
        affichageEtudiants(mesEtudiantsOrdreQcq);
        System.out.println("======================\n\nLes étudiants triés:");
        // Créer l'ensemble d'étudiants trié et ajouter les étudiants
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();
        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        mesEtudiantsTries.add(etudiant3);
        mesEtudiantsTries.add(etudiant4);
        mesEtudiantsTries.add(etudiant5);
        // Afficher l'ensemble d'étudiants trié
        affichageEtudiants(mesEtudiantsTries);
    }
}
