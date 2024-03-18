package tp2.contraintes;

public class ReelContraint {
    //attributs de la classe ReelContraint
    private double min;
    private double max;
    private double valeur;

    //constructeur de la classe ReelContraint
    public ReelContraint(double min, double max){
        this.min= min;
        this.max= max;
        this.valeur=min;
    }

    //getters de la classe ReelContraint
    public double getValeur() { return this.valeur;}

    //Méthodes de la classe ReelContraint
    public void setValeur(double valeur) {
        if (valeur <= this.max && valeur >= this.min) {
            this.valeur = valeur;
        }
    }
    @Override
    public String toString() {
        return "Valeur: "+this.valeur+", min: "+this.min+", max: "+this.max;
    }
}
