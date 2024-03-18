package tp1.forme;

public class FormeUtilitaire {
    public static void affichePoint(Point point) {
        System.out.println("Point: X="+point.getX()+", Y="+point.getY());
    }
    public static void afficheCercle(Cercle cercle) {
        System.out.println("Cercle: R="+cercle.getRayon()+", Centre=("+cercle.getCentre().getX()+","+cercle.getCentre().getY()+"), Périmètre="+cercle.getPerimetre()
                +", Aire="+cercle.getAire());
    }
    public static void afficheRectangle(Rectangle rectangle) {
        System.out.println("Rectangle: l="+rectangle.getLargeur()+", L="+rectangle.getLongueur()+", Origine=("+rectangle.getOrigine().getX()+","
        +rectangle.getOrigine().getY()+"), Périmètre="+rectangle.getPerimetre()+", Aire="+rectangle.getAire());
    }
}
