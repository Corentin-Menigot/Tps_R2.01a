package tp4.collection;

import java.util.ArrayList;

public class CollectionUtilitaire {
    public static void afficheCollection(String s, ArrayList<Integer> premiereListeDEntiers) {
        for (int i=0; i<premiereListeDEntiers.size(); i++) {
            System.out.println(premiereListeDEntiers.get(i));
        }
        System.out.println("---------------------------");
    }
}
