package tp6;

public class ArticleUtilitaire {
    public static String capitalize(String ch) {
        return ch.substring(0, 1).toUpperCase() + ch.substring(1, ch.length()).toLowerCase();
    }
}
