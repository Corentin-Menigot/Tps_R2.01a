package tp4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionUtilitaire {
        public static <T> void afficheCollection(String message, Collection<T> collection) {
            System.out.println(message);
            for (T element : collection) {
                System.out.println(element);
            }
            System.out.println();
    }
}
