package tp2.contraintes;

public class Note extends ReelContraint{
    //constructeurs de la classe Note
    public Note() { super(0, 20);}
    public Note(double valeur) {
        super(0, 20);
        setValeur(valeur);
    }
}
