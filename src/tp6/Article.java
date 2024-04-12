package tp6;

public class Article {
    //attributs
    private String intitule;
    private double prix;
    private int stock;
    private final int SEUIL = 100;

    //constructeur
    public Article(String intitule, double prix, int stock) throws IntituleException, PrixException {
        setIntitule(intitule);
        setPrix(prix);
        setStock(stock);
    }

    //méthodes

    public String getIntitule() {
        return this.intitule;
    }
    public void setIntitule(String intitule) throws IntituleException {
        //renvoie une chaine composée de la premiére lettre de intitule en majuscule concaténée au reste de intitule en minuscule
        if (intitule == null || intitule.equals("")) {
            throw new IntituleException("Un intitulé ne peut être null ou vide");
        }
        this.intitule = ArticleUtilitaire.capitalize(intitule);
    }

    public double getPrix() {
        return this.prix;
    }
    public double getPrix(int quantite) {
        if (quantite >= SEUIL) {
            return this.prix * quantite * 0.9;
        } else {
            return this.prix * quantite;
        }
    }
    public void setPrix(double prix) throws PrixException {
        if (prix <= 0) {
            throw new PrixException();
        }
        this.prix = prix;
    }

    public int getStock() {
        return this.stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public boolean existQuantite(int quantite) {
        return this.stock >= quantite;
    }
    public void removeQuantite(int quantite) throws StockException {
        if (!existQuantite(quantite)) {
            throw new StockException();
        }
        this.stock = this.stock - quantite;
    }
}
