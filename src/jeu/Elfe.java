package jeu;

public class Elfe extends Guerrier{
    //attributs
    private final int RESSOURCE = 2;

    //constructeur
    public Elfe() {super();}

    //méthodes de la classe Elfe
    @Override
    public int getForce() {
        //on renvoit la force d'un guerrier normal, multiplés par 2
        return super.getForce()*2;
    }
    @Override
    public int getRessourcesPourEntrainement() {
        return this.RESSOURCE;
    }

}
