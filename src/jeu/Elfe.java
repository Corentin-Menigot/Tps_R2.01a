package jeu;

public class Elfe extends Guerrier{
    //attributs
    private final int RESSOURCE_BASE = 2;

    //constructeur
    public Elfe(Chateau chateau) {super(chateau);}

    //méthodes de la classe Elfe
    @Override
    public int getForce() {
        //on renvoit les dégats d'un guerrier normal, multiplés par 2
        return super.getForce()*2;
    }
}
