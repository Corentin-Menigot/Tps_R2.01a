package tp4.dalton;

import java.util.Comparator;

public class ComparateurTaille implements Comparator<Taille> {
    @Override
    public int compare(Taille t1, Taille t2) {
        if ( (t2 == Taille.GRAND && t1 != t2) | (t2 == Taille.MOYEN && t1 == Taille.PETIT) ){
            return -1;
        } else if (t1 == t2) {
            return 0;
        } else {
            return 1;
        }
    }
}
