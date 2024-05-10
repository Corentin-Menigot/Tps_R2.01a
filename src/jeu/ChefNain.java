package jeu;

public class ChefNain extends Nain{
    //attributs
    private final int RESSOURCE = 3;
    //constructeur
    public ChefNain(Chateau chateau) {super(chateau);}

    //méthodes de la classe ChefNain
    @Override
    protected void subirDegats(int degats) {
        //on renvoit les dégats subits par un nain normal, divisés par 2
        super.subirDegats(degats/2);
    }
    @Override
    public int getRessourcesPourEntrainement() {
        return this.RESSOURCE;
    }
}
