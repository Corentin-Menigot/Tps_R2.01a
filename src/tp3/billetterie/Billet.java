package tp3.billetterie;

public class Billet {
    private Trajet trajet;
    private double prixAuKm;
    private final double minPrixAuKm = 0.1;
    private final double maxPrixAuKm = 2;

    Billet(Trajet trajet, double prixAuKm) {
        this.trajet = trajet;
        setPrixAuKm(prixAuKm);
    }

    public String getDepart() { return this.trajet.getDepart();}
    public String getArrivee() { return this.trajet.getArrivee();}
    public int getDistance() { return this.trajet.getDistance();}
    public double getPrixAuKm() { return this.prixAuKm;}
    public double getPrix() { return BilletterieUtilitaire.arrondir(this.prixAuKm*this.getDistance());}

    public void setPrixAuKm(double prixAuKm) {
        if (prixAuKm < minPrixAuKm) {
            this.prixAuKm = minPrixAuKm;
        } else if (prixAuKm > maxPrixAuKm) {
            this.prixAuKm = maxPrixAuKm;
        } else {
            this.prixAuKm =prixAuKm;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+" : "+trajet+", prix du billet: "+getPrix();
    }


}