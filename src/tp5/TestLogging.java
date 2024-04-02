package tp5;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestLogging {
    // Récupération du logger
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

    public static void main(String[] args) {
        LOGGER.log( Level.INFO, "Mon premier log !" );
        LOGGER.log( Level.WARNING, "Attention à une division par zéro");
        int dividende = (int) (Math.random()*10);
        int diviseur = (int) (Math.random()*3);
        try {
        int quotient = dividende / diviseur;
        LOGGER.log( Level.INFO, "Dividende: "+dividende+", diviseur: "+diviseur+", quotient: "+quotient);}
        catch (ArithmeticException a) {
            LOGGER.log( Level.SEVERE, "Le message d'exception : java.lang.ArithmeticException: divide by zero");
        }
    }
}
