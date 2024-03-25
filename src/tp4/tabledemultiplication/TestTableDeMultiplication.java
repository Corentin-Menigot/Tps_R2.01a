package tp4.tabledemultiplication;
import java.util.Scanner;

public class TestTableDeMultiplication {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int nombreTable;

        System.out.println("Donner un nombre pour la table de multiplication entre 1 et 10 : ");
        nombreTable = lecteur.nextInt();
        lecteur.nextLine();
        while (nombreTable > 10 || nombreTable < 1) {
            System.out.println("Merci de répondre entre 1 et 10 ? ");
            nombreTable = lecteur.nextInt();
            lecteur.nextLine();
        }

        int melange;

        System.out.println("Entrainement (1) ou exercice (2) ? ");
        melange = lecteur.nextInt();
        lecteur.nextLine();
        while (melange > 2 || melange < 1) {
            System.out.println("Merci de répondre par 1 ou 2 ? ");
            melange = lecteur.nextInt();
            lecteur.nextLine();
        }
        boolean estMelange = false;

        if (melange == 2) {
            estMelange = true;
        }

        TableDeMultiplication table = new TableDeMultiplication(nombreTable, estMelange);

        System.out.println("Donner les réponses aux multiplications : ");
        int reponse;
        for (int i = 0; i < table.getNombreDeMultiplications(); i++) {
            System.out.println(table.getMultiplication(i));
            reponse = lecteur.nextInt();
            lecteur.nextLine();
            table.getMultiplication(i).setReponseUtilisateur(reponse);
        }

        System.out.println("Nombre de réponses justes : "+table.getNombreReponsesJustes());
    }
}
