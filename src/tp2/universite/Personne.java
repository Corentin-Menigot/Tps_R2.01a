package tp2.universite;

import tp1.universite.EtudiantUtilitaire;

public abstract class Personne {
    //attributs de la classe Personne
    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    //constructeur de la classe Personne
    Personne(String login, String prenom, String nom) {
        setLogin(login);
        setPrenom(prenom);
        setNom(nom);
    }
    Personne(String login, String prenom, String nom, String adresse) {
        setLogin(login);
        setPrenom(prenom);
        setNom(nom);
        setAdresse(adresse);
    }

    //Setters de la classe Personne
    public void setLogin(String login) { this.login=login.toLowerCase();}
    public void setNom(String nom) {
        this.nom= UniversiteUtilitaire.capitalize(nom);
    }
    public void setPrenom(String prenom) {
        this.prenom=UniversiteUtilitaire.capitalize(prenom);
    }
    public void setAdresse(String adresse) { this.adresse=adresse;}

    //méthodes de la classe Personne
    public String getLogin() { return this.login;}
    public String getPrenom() { return this.prenom;}
    public String getNomComplet() { return prenom+" "+nom;}
    public String getNom() { return this.nom;}
    public String getAdresse() {
        if (existAdresse()) {
            return this.adresse;
        } else {
            return "Aucune";
        }
    }
    public abstract String getMail();
    public boolean existAdresse() { return adresse!=null;}

}
