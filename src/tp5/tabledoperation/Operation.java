package tp5.tabledoperation;

public abstract class Operation {
    //attributs de la classe
    private double terme1;
    private double terme2;
    private Double reponseUtilisateur;

    //constructer de la classe
    public Operation (double terme1, double terme2) {

    }

    //méthodes et fpnctions de la classe

    public void setReponseUtilisateur(double reponse) {
        this.reponseUtilisateur = reponse;
    }
    public boolean existReponseUtilisateur () {
        return this.reponseUtilisateur != null;
    }
    public boolean isReponseJuste() {
        return reponseUtilisateur == calculResultat();
    }
    public abstract double calculResultat();
    public double getTerme1 () { return this.terme1;}
    public double getTerme2 () { return this.terme2;}
}
