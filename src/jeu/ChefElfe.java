package jeu;

public class ChefElfe extends Elfe{
    //attributs
    private final int RESSOURCE = 4;

    //constructeur
    public ChefElfe() {super();}
    //méthodes de la classe ChefElfe
    @Override
    public int getForce() {
        //on renvoit la force d'un elfe normal, multiplés par 2
        return super.getForce()*2;
    }
    @Override
    public int getRessourcesPourEntrainement() {
        return this.RESSOURCE;
    }
}
