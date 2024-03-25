package tp4.tabledemultiplication;
import java.util.Scanner;

public class TestTableDeMultiplication {
    private static void demandeReponseUtilisateur(Multiplication multiplication) {
        Scanner entree = new Scanner(System.in);
        // Affichage de la multiplication
        System.out.print(multiplication);
        // Demander la réponse utilisateur
        int reponseUtilisateur = entree.nextInt();
        entree.nextLine();
        // Enregistrer la réponse utilisateur
        // Mode sans erreur : attraper l'exception si la réponse de
        // l'utilisateur n'est pas la bonne et redemander la reponse
        // utilisateur
        try {
            multiplication.setReponseUtilisateur(reponseUtilisateur);
        } catch (ErreurMultiplicationException e) {
            System.out.println("Votre réponse n'est pas correcte, réessayer !");
            demandeReponseUtilisateur(multiplication);
        }
    }

    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int nombreTable;

        System.out.print("Donner un nombre pour la table de multiplication entre 1 et 10 : ");
        nombreTable = lecteur.nextInt();
        lecteur.nextLine();
        while (nombreTable > 10 || nombreTable < 1) {
            System.out.print("Merci de répondre entre 1 et 10 ? ");
            nombreTable = lecteur.nextInt();
            lecteur.nextLine();
        }

        int melange;

        System.out.print("Entrainement (1) ou exercice (2) ? ");
        melange = lecteur.nextInt();
        lecteur.nextLine();
        while (melange > 2 || melange < 1) {
            System.out.print("Merci de répondre par 1 ou 2 ? ");
            melange = lecteur.nextInt();
            lecteur.nextLine();
        }

        boolean estMelange = false;
        if (melange == 2) {
            estMelange = true;
        }

        System.out.print("Mode sans erreur true ou false ? ");
        boolean sansErreur = lecteur.nextBoolean();
        lecteur.nextLine();

        TableDeMultiplication table = new TableDeMultiplication(nombreTable, estMelange, sansErreur);

        System.out.println("Donner les réponses aux multiplications : ");
        for (int i = 0; i < table.getNombreDeMultiplications(); i++) {
            demandeReponseUtilisateur(table.getMultiplication(i));
        }
        System.out.println("Nombre de réponses justes : " + table.getNombreReponsesJustes());
    }
}
