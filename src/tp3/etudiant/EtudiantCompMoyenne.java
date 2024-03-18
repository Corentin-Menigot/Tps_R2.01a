package tp3.etudiant;

import tp2.universite.Etudiant;

import java.util.Comparator;

public class EtudiantCompMoyenne implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        if(e1.getMoyenne()< e2.getMoyenne()){
            return -1;
        } else if(e1.getMoyenne()==e2.getMoyenne()){
            return 0;
        } else {
            return 1;
        }
    }
}
