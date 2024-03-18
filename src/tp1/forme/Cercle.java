package tp1.forme;

public class Cercle {

    //attributs de la classe Cercle
    private int rayon;
    private Point centre;

    //constructeurs de la classe Cercle
    Cercle(int monRayon) {
        setRayon(monRayon);
    }
    Cercle(int monRayon, Point centre) {
        setRayon(monRayon);
        this.centre=centre;}

    //getters de la classe Cercle
    public int getRayon() { return this.rayon;}
    public Point getCentre() { return this.centre;}
    public double getPerimetre() { return 2*this.rayon*Math.PI;}
    public double getAire() { return Math.pow(rayon, 2)*Math.PI;}

    //méthodes de la classe Cercle
    public void setRayon(int nouveauRayon) {
        this.rayon=nouveauRayon;
    }
    public void deplaceCentre(int dX, int dY) {
        this.centre.deplaceXY(dX, dY);
    }
}
