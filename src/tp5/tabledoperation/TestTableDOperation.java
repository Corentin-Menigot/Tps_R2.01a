package tp5.tabledoperation;

import tp4.tabledemultiplication.ErreurMultiplicationException;
import tp5.TestLogging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestTableDOperation {
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

    private static void demandeReponseUtilisateur(Operation operation) {
        Scanner entree = new Scanner(System.in);
        // Affichage de la multiplication
        System.out.print(operation);
        // Demander la réponse utilisateur
        double reponseUtilisateur = entree.nextDouble();
        entree.nextLine();
        // Enregistrer la réponse utilisateur
        // Mode sans erreur : attraper l'exception si la réponse de
        // l'utilisateur n'est pas la bonne et redemander la reponse
        // utilisateur
        try {
            operation.setReponseUtilisateur(reponseUtilisateur);
        } catch (ErreurOperationException e) {
            System.out.println("Votre réponse n'est pas correcte, réessayer !");
            demandeReponseUtilisateur(operation);
        }
    }

    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Addition 1 ou Soustraction 2 ou Multiplication 3 ? ");
        //typeOp sert pour le type d'opération de la table
        int typeOp = lecteur.nextInt();
        lecteur.nextLine();
        //boucle pour gérer si typeOp prend une valeur entre 1 et 3
        while (typeOp < 1 || typeOp > 3) {
            System.out.print("Merci de répondre par 1 ou 2 ou 3 ? ");
            typeOp = lecteur.nextInt();
            lecteur.nextLine();
        }

        //mode sans erreur ou non
        System.out.print("Mode sans erreur true ou false ? ");
        boolean sansErreur = lecteur.nextBoolean();
        lecteur.nextLine();
        LOGGER.log(Level.INFO, "Mode sans erreur "+sansErreur);

        //création de la table d'opérations en fonction de typeOp
        TableDOperation table;
        if (typeOp == 1) {
            table = new TableDOperation(OperationEnum.ADDITION, sansErreur);
            LOGGER.log (Level.INFO, "Type d'operation : ADDITION");
        } else if (typeOp == 2) {
            table = new TableDOperation(OperationEnum.SOUSTRACTION, sansErreur);
            LOGGER.log (Level.INFO, "Type d'operation : SOUSTRACTION");
        } else {
            table = new TableDOperation(OperationEnum.MULTIPLICATION, sansErreur);
            LOGGER.log (Level.INFO, "Type d'operation : MULTIPLICATION");
        }

        //liste d'opérations
        System.out.println("Donner les réponses aux multiplications : ");
        for (int i = 0; i < table.getNombreDOperations(); i++) {
            demandeReponseUtilisateur(table.getOperation(i));
        }
        System.out.println("Nombre de réponses justes : " + table.getNombreReponsesJustes());
    }
}
