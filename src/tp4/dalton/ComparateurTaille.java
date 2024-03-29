package tp4.dalton;

import java.util.Comparator;

public class ComparateurTaille implements Comparator<Dalton> {
    @Override
    public int compare(Dalton d1, Dalton d2) {
        if ( (d2.getTaille() == Taille.GRAND && d1.getTaille() != d2.getTaille()) | (d2.getTaille() == Taille.MOYEN && d1.getTaille() == Taille.PETIT) ){
            return -1;
        } else if (d1.getTaille() == d2.getTaille()) {
            return 0;
        } else {
            return 1;
        }
    }
}
