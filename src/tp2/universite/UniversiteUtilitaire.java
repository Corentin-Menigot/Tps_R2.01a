package tp2.universite;

public class UniversiteUtilitaire {
    public static String capitalize(String chaine) {
        String chaineRetour= chaine.substring(0,1).toUpperCase();
        chaineRetour=chaineRetour.concat(chaine.substring(1).toLowerCase()) ;
        return chaineRetour;
    }

    public static void affichePersonne(Personne personne) {
        System.out.println("Login: "+personne.getLogin()+"\n" +
                "Nom complet: "+personne.getNomComplet()+"\n" +
                "Mail: "+personne.getMail()+"\n" +
                "Adresse: "+ personne.getAdresse()+"\n" +
                "-----------------------------------------\n");
    }
    public static void affichePersonnel(Personnel personnel) {
        System.out.println("Login: "+personnel.getLogin()+"\n" +
                "Nom complet: "+personnel.getNomComplet()+"\n" +
                "Mail: "+personnel.getMail()+"\n" +
                "Adresse: "+ personnel.getAdresse()+"\n" +
                "Echelon: "+ personnel.getEchelon()+"\n" +
                "Point d'indice: "+personnel.getPointIndice()+"\n" +
                "Salaire: "+ personnel.getSalaire() +"\n" +
                "-----------------------------------------\n");
    }
}
