package tp1.forme;

public class Point {

    //attributs de la classe Point
    private int x;
    private int y;

    //constructeurs de la classe Point
    Point() {
        this.x=0;
        this.y=0;
    }

    Point(int valX, int valY) {
        setX(valX);
        setY(valY);
    }

    //getters de la classe Point
    public int getX() {return x;}
    public int getY() {return y;}

    //méthodes de la classe Point
    public void setX(int valX) {
        if (valX>=0) {
            this.x = valX;
        } else {
            this.x=0;
        }
    }
    public void setY(int valY) {
        if (valY>=0) {
            this.y = valY;
        } else {
            this.x=y;
        }
    }
    public void deplaceXY(int dX, int dY) {
        //on vérifie que x ne sera pas inférieur à 0 avec le deplacement, si c'est le cas on borne x à 0
        if (this.x+dX<0) {
            this.x=0;
        } else {
            this.x=this.x+dX;
        }
        //on vérifie que y ne sera pas inférieur à 0 avec le deplacement, si c'est le cas on borne y à 0
        if (this.y+dY<0) {
            this.y=0;
        } else {
            this.y=this.y+dY;
        }
    }
}
