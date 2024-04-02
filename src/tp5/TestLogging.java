package tp5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {
    // Récupération du logger
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());
    // Configuration du logger
    static {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$s]  %4$-10s | (%3$s) %2$-15s | %5$s\n");
        LOGGER.setLevel(Level.WARNING);
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
