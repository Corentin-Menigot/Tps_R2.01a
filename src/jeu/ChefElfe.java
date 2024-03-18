package jeu;

public class ChefElfe extends Elfe{
    //méthodes de la classe ChefElfe
    @Override
    public int getForce() {
        //on renvoit les dégats d'un elfe normal, multiplés par 2
        return super.getForce()*2;
    }
}
