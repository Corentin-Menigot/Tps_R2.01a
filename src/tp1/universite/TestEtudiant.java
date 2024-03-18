package tp1.universite;

public class TestEtudiant {
    public static void main(String[] args) {
        //déclaration de 2 Etudiant
        Etudiant etudiant1= new Etudiant("DUPONTP", "pierre", "DUPONT");
        Etudiant etudiant2= new Etudiant("martinf", "francis", "martin");

        //ajout d'une adresse pour l'étudiant 2
        etudiant2.setAdresse("2 Place Doyen Gosse");

        //ajout de notes à l'étudiant 2
        etudiant2.addNote(8.5);
        etudiant2.addNote(10.0);
        etudiant2.addNote(11.5);

        //ajout d'un groupe pour l'étudiant 1
        etudiant1.setGroupe(new Groupe("A"));

        //affichage des 2 étudiants
        System.out.println("------------------------");
        EtudiantUtilitaire.affiche(etudiant1);
        System.out.println("\n------------------------");
        EtudiantUtilitaire.affiche(etudiant2);
    }
}
