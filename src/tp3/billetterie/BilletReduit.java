package tp3.billetterie;

public class BilletReduit extends Billet{
    private double tauxDeReduction;
    private final double minTauxDeReduction = 0.05;
    private final double maxTauxDeReduction = 0.5;

    BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduction) {
        super(trajet, prixAuKm);
        setTauxDeReduction(tauxDeReduction);
    }

    public double getTauxDeReduction() { return this.tauxDeReduction;}
    public double getPrix() { return BilletterieUtilitaire.arrondir(super.getPrix()-(super.getPrix()*this.tauxDeReduction));}

    public void setTauxDeReduction(double tauxDeReduction) {
        if (tauxDeReduction < minTauxDeReduction) {
            this.tauxDeReduction = minTauxDeReduction;
        } else if (tauxDeReduction > maxTauxDeReduction) {
            this.tauxDeReduction = maxTauxDeReduction;
        } else {
            this.tauxDeReduction = tauxDeReduction;
        }
    }

    @Override
    public String toString() {
        return super.toString()+", réduction: "+tauxDeReduction*100+"%";
    }
}
