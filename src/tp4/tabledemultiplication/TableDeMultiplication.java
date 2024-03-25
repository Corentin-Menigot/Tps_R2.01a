package tp4.tabledemultiplication;

import java.util.ArrayList;

public class TableDeMultiplication {
    //attributs
    int nombreTable;
    ArrayList<Multiplication> multiplications = new ArrayList<>();
    final int DebutTable = 1;
    final int FinTable = 10;
    boolean modeSansErreur;

    //constructeurs
    public TableDeMultiplication(int nombreTable, boolean estMelange, boolean modeSansErreur) {
        this.nombreTable=nombreTable;
        this.initialisation();
        if (estMelange) {
            this.melange();
        }
        this.modeSansErreur = modeSansErreur;
    }

    //méthodes
    private void initialisation() {
        for (int i=DebutTable; i<=FinTable; i++) {
            this.multiplications.add(new Multiplication(nombreTable, i, modeSansErreur));
        }
    }
    private void melange() {
        ArrayList<Multiplication> multiplicationsTemp = new ArrayList<>();
        int random;
        for (int i = 0; i<FinTable; i++) {
            random = (int) (Math.random()*this.getNombreDeMultiplications());
            multiplicationsTemp.add(this.getMultiplication(random));
            this.multiplications.remove(random);
        }
        this.multiplications=multiplicationsTemp;
    }
    public int getNombreReponsesJustes() {
        int reponsesJustes=0;
        for (int i=0; i<FinTable; i++) {
            if (this.multiplications.get(i).isReponseJuste()) {
                reponsesJustes++;
            }
        }
        return reponsesJustes;
    }
    public int getNombreDeMultiplications() {
        return multiplications.size();
    }
    public Multiplication getMultiplication(int index) {
        return this.multiplications.get(index);
    }
 }
