package tp1.universite;

public class EtudiantUtilitaire {

    /**
     *
     * @param chaine
     * @return une chaine avec son premier caractère lettre en majuscule et le reste en minuscule
     */
    public static String capitalize(String chaine) {
        String chaineRetour= chaine.substring(0,1).toUpperCase();
        chaineRetour=chaineRetour.concat(chaine.substring(1).toLowerCase()) ;
        return chaineRetour;
    }

    /**
     * affiche les caractéristiques d'un étudiant
     *
     * @param etu
     */
    public static void affiche(Etudiant etu) {
        System.out.println("Login: "+etu.getLogin()+"\n" +
                "Nom complet: "+etu.getNomComplet()+"\n" +
                "Mail: "+etu.getMail());

        //affichage du groupe de l'élève si il en posséde un
        if (etu.existGroupe()) {
            System.out.println("Groupe: "+etu.getGroupe().getLibelle());
        } else {
            System.out.println("Groupe: aucun");
        }

        //affichage de l'adresse de l'étudiant si il en posséde une
        if (etu.existAdresse()) {
            System.out.println("Adresse: "+etu.getAdresse());
        } else {
            System.out.println("Adresse: aucune");
        }

        //affichage des notes et de la moyenne de l'étudiant, si l'élève posséde des notes
        if (etu.existNotes()) {
            System.out.printf("Moyenne: "+etu.getMoyenne()+"\n" +
                    etu.getNbNote()+" notes: ");
            for (int i=0; i<etu.getNbNote(); i++) {
                System.out.print(etu.getNotes()[i]+" ");
            }
        } else {
            System.out.println("Moyenne: aucune notes");
        }
    }

}
