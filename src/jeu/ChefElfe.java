package jeu;

public class ChefElfe extends Elfe{
    //attributs
    private final int RESSOURCE = 4;

    //constructeur
    public ChefElfe(Chateau chateau) {super(chateau);}
    //méthodes de la classe ChefElfe
    @Override
    public int getForce() {
        //on renvoit les dégats d'un elfe normal, multiplés par 2
        return super.getForce()*2;
    }
    @Override
    public int getRessourcesPourEntrainement() {
        return this.RESSOURCE;
    }
}
