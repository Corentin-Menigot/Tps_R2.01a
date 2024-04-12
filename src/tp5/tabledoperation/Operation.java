package tp5.tabledoperation;

import tp4.tabledemultiplication.ErreurMultiplicationException;

public abstract class Operation {
    //attributs de la classe
    private double terme1;
    private double terme2;
    boolean modeSansErreur;
    private Double reponseUtilisateur;

    //constructer de la classe
    public Operation (double terme1, double terme2, boolean modeSansErreur) {
        this.terme1 = terme1;
        this.terme2 = terme2;
        this.modeSansErreur = modeSansErreur;
    }

    //méthodes et fpnctions de la classe

    public void setReponseUtilisateur(double reponse) throws ErreurOperationException {
        this.reponseUtilisateur = reponse;
        if (this.modeSansErreur & !this.isReponseJuste()) {
            throw new ErreurOperationException();
        }
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
