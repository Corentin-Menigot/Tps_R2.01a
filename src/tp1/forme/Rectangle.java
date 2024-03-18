package tp1.forme;

public class Rectangle {
    //constructeurs de la classe Rectangle
    private int largeur;
    private int longueur;
    private Point origine;

    //constructeurs de la classe Rectangle
    Rectangle(int l, int L) {setLargeur(l); setLongueur(L);}
    Rectangle(int l, int L, int valX, int valY) {setLargeur(l); setLongueur(L); this.origine= new Point(valX, valY);}

    //setters de la classe Rectangle


    //méthodes de la classe Rectangle
    public int getLargeur() { return this.largeur;}
    public int getLongueur() { return this.longueur;}
    public Point getOrigine() { return new Point(origine.getX(), origine.getY());}
    public double getPerimetre() { return (this.largeur*2)+(this.longueur*2);}
    public double getAire() { return this.largeur*this.longueur;}
    public void setLargeur(int l) {this.largeur=l;}
    public void setLongueur(int L) {this.longueur=L;}
    public void deplaceOrigine(int dX, int dY) {
        origine.deplaceXY(dX, dY);
    }


}
