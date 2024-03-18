package jeu;

public class ChefNain extends Nain{
    //méthodes de la classe ChefNain
    @Override
    protected void subirDegats(int degats) {
        //on renvoit les dégats subits par un nain normal, divisés par 2
        super.subirDegats(degats/2);
    }
}
