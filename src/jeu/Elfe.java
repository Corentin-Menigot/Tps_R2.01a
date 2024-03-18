package jeu;

public class Elfe extends Guerrier{
    //méthodes de la classe Elfe
    @Override
    public int getForce() {
        //on renvoit les dégats d'un guerrier normal, multiplés par 2
        return super.getForce()*2;
    }
}
