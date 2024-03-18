package tp4.collection;

import java.util.ArrayList;

public class TestIterator {
    public static void main(String[] args) {
        // Création d'une liste d'entiers
        ArrayList<Integer> premiereListeDEntiers = new ArrayList<>();
        premiereListeDEntiers.add(5);
        premiereListeDEntiers.add(1);
        premiereListeDEntiers.add(10);
        premiereListeDEntiers.add(3);
        premiereListeDEntiers.add(20);
        premiereListeDEntiers.add(5);
        // Création d'une deuxième liste d'entiers
        ArrayList<Integer> deuxiemeListeDEntiers = new ArrayList<>(premiereListeDEntiers);
        // Affichage de la première liste d'entiers
        CollectionUtilitaire.afficheCollection("Affichage de la première liste " +
                "d'entiers", premiereListeDEntiers);
    // Enlever les entiers inferieurs à 10 dans la première liste d'entiers en
        // utilisant un FOR
    // A COMPLETER
        // Affichage de la liste première d'entiers après filtre
        CollectionUtilitaire.afficheCollection("Affichage de la liste première " +
                "d'entiers après filtre", premiereListeDEntiers);
    // Affichage de la deuxième liste d'entiers
        CollectionUtilitaire.afficheCollection("Affichage de la deuxième liste " +
                "d'entiers", deuxiemeListeDEntiers);
    // Enlever les entiers inferieurs à 10 dans la deuxième liste d'entiers enutilisant un WHILE
        // A COMPLETER
        // Affichage de la deuxième liste d'entiers après filtre
        CollectionUtilitaire.afficheCollection("Affichage de la deuxième liste " +
                "d'entiers après filtre", deuxiemeListeDEntiers);
    }
}
