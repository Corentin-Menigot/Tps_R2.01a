package tp5.tabledoperation;

import tp5.TestLogging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TableDOperation {
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());
    // Configuration du logger
    // Récupérarion du gestionnaire de logs.
    private static final LogManager logManager = LogManager.getLogManager();
    // Configuration du logger
    // EditConfiguration > Modify options > add VM options :
    // -Djava.util.logging.config.file=conf/debug-logging.properties
    static{
        try {
            logManager.readConfiguration( new FileInputStream("conf/debug- logging.properties") );
        } catch ( IOException exception ) {
            LOGGER.log( Level.SEVERE, "Cannot read configuration file", exception );
        }
    }

    //attributs de la classe
    private OperationEnum typeOperation;
    private ArrayList<Operation> operations = new ArrayList<>();
    private final int NBOPERATIONS = 5;
    boolean modeSansErreur;

    //Constructeur de la classe
    public TableDOperation(OperationEnum typeOperation, boolean modeSansErreur) {
        this.typeOperation = typeOperation;
        this.modeSansErreur = modeSansErreur;
        this.initialisation();
    }

    //méthodes et fonctions de la classe
    private void initialisation() {
        for (int i=0; i<NBOPERATIONS; i++) {
            double op1 = OperationUtilitaire.randomDouble();
            double op2 = OperationUtilitaire.randomDouble();
            LOGGER.log  (Level.INFO, "Création d'opération avec les termes "+op1+" et "+op2);
            if (this.typeOperation == OperationEnum.ADDITION) {
                operations.add(new Addition(op1, op2, modeSansErreur));
            } else if (this.typeOperation == OperationEnum.SOUSTRACTION) {
                operations.add(new Soustraction(op1, op2, modeSansErreur));
            } else if (this.typeOperation == OperationEnum.MULTIPLICATION) {
                operations.add(new Multiplication(op1, op2, modeSansErreur));
            }
        }
    }
    public int getNombreReponsesJustes() {
        int justes = 0;
        for (int i=0; i < this.getNombreDOperations(); i++) {
            if (operations.get(i).isReponseJuste()) {
                justes++;
                LOGGER.log(Level.INFO, "getNombreDeReponsesJustes | Une réponse juste de l'utilisateur");
            } else {
                LOGGER.log(Level.WARNING, "getNombreDeReponsesJustes | Une réponse fausse de l'utilisateur");
            }
        }
        return justes;
    }
    public int getNombreDOperations() {
        return operations.size();
    }
    public Operation getOperation(int index) {
        return operations.get(index);
    }
}
