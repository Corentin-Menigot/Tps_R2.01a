package jeu;

public class Nain extends Guerrier {
    //attributs
    private final int RESSOURCE = 1;
    //constructeur
    public Nain() {super();}

    //méthodes de la classe Nain
    @Override
    protected void subirDegats(int degats) {
        //on renvoit les dégats subits par un guerrier normal, divisés par 2
        super.subirDegats(degats/2);
    }
}
