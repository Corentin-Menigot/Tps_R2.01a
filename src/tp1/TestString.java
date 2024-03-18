package tp1;
import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner entree= new Scanner(System.in);
        System.out.print("Entrez une chaine: ");
        String maChaine=entree.nextLine();
        System.out.println(maChaine);
        System.out.println("Longueur: "+maChaine.length());
        System.out.println(maChaine.toUpperCase());
        System.out.print("Entrez une deuxième chaine: ");
        String maChaine2= entree.nextLine();

        //on vérifie que maChaine et maChaine 2 sont égales sans tenir comtpe de la casse
        if(maChaine.compareToIgnoreCase(maChaine2)==0){
            System.out.println("Les 2 chaines sont identiques");
        } else {
            System.out.println("Les 2 chaines ne sont pas identiques");
        }

        //on vérifie que maChaine est en majuscule et on renvoie un message en fonction
        if(maChaine.compareTo(maChaine.toLowerCase())==0){
            System.out.println("La chaine est en minuscule");
        } else {
            System.out.println("La chaine n'est pas en majuscule");
        }

        //on vérifie que la chaine commence par un "blanc", si c'est le cas on remplace maChaine
        // par une sous chaine sans le "blanc" jusqu'à ce qu'il n'y ai plus de "blanc"
        while (maChaine.charAt(0)==' '){
            maChaine=maChaine.substring(1,maChaine.length()-1);
        }

        //on affiche maChaine en majuscule et sans les blancs
        System.out.println(maChaine.toUpperCase().trim());

        //création d'un StringBuilder qui représente maChaine en inversé
        StringBuilder maChaineReverse= new StringBuilder(maChaine);
        maChaineReverse.reverse();

        //vérification que maChaine est un palyndrome en comparant maChaine à un StringBuilder qui est maChaine inversé
        if (maChaine.equals(maChaineReverse.toString())){
            System.out.println("maChaine est un palindrome");
        } else {
            System.out.println("maChaine n'est pas un palindrome");
        }
    }
}
