package tp2.telephone;

public class Memoire {
    //attributs de la classe Memoire
    private String type;
    private int nombreGiga;

    //constructeur de la classe Memoire
    public Memoire(String type, int nombreGiga) {
        this.type=type;
        this.nombreGiga=nombreGiga;
    }

    //méthodes de la classe Memoire
    public String getType() { return this.type;}
    public int getNombreGiga() { return this.nombreGiga;}
}
