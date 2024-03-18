package tp3.billetterie;

public class Trajet {
    private String depart;
    private String arrivee;
    private int distance;
    private final int minDistance = 5;
    private final int maxDistance = 2000;

    Trajet(String depart, String arrivee, int distance) {
        setDepart(depart);
        setArrivee(arrivee);
        setDistance(distance);
    }

    public String getDepart() { return this.depart;}
    public String getArrivee() { return this.arrivee;}
    public int getDistance() { return distance;}

    public void setDepart(String depart) { this.depart=depart.toUpperCase();}
    public void setArrivee(String arrivee) { this.arrivee=arrivee.toUpperCase();}
    public void setDistance(int distance) {
        if (distance < minDistance) {
            this.distance = minDistance;
        } else if (distance > maxDistance) {
            this.distance = maxDistance;
        } else {
            this.distance = distance;
        }
    }
    @Override
    public String toString() {
        return "["+this.getClass().getSimpleName()+": départ: "+depart+", arrivée: "+arrivee+", distance: "+distance+"KM]";
    }
}
