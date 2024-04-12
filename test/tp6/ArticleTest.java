package tp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {
    @Test
    void getIntitule() throws IntituleException, PrixException {
        //
        Article article1 = new Article("minuscule", 2.0, 10);
        assertEquals(article1.getIntitule(), "Minuscule", "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");

        //
        Article article2 = new Article("MAJUSCULE", 2.0, 10);
        assertEquals(article2.getIntitule(), "Majuscule", "Un intitulé doit avoir la première lettre en Majuscule et le reste en minuscule");
    }
    @Test
    void setIntitule() throws IntituleException, PrixException {
        //
        assertThrows(IntituleException.class,
                () -> {new Article(null, 2.0, 10);},
                "Un intitulé ne peut pas être null.");

        //
        assertThrows(IntituleException.class,
                () -> {new Article("", 2.0, 10);},
                "Un intitulé ne peut pas être null.");
    }
    @Test
    void getPrix() throws PrixException, IntituleException {
        //
        Article article1 = new Article("article", 2.0, 200);
        assertEquals(article1.getPrix(50), 100, "Le prix d'un produit doit avoir une ristourne de 10% si la quantité est supérieur ou égale à 100");

        //
        Article article2 = new Article("article", 2.0, 200);
        assertEquals(article1.getPrix(100), 180, "Le prix d'un produit doit avoir une ristourne de 10% si la quantité est supérieur ou égale à 100");
    }
    @Test
    void setPrix() {
        //
        assertThrows(PrixException.class,
                () -> {new Article("article", 0, 100);},
                "Le prix d'un article ne peut pas être égal ou inférieur à 0"
        );

        //
        assertThrows(PrixException.class,
                () -> {new Article("article", -1, 100);},
                "Le prix d'un article ne peut pas être égal ou inférieur à 0"
        );
    }
    @Test
    void existQuantite() throws PrixException, IntituleException {
        //
        Article article1 = new Article("article", 2.0, 100);
        assertTrue(article1.existQuantite(100));

        //
        Article article2 = new Article("article", 2.0, 100);
        assertFalse(article2.existQuantite(150));
    }
    @Test
    void removeQuantite() throws PrixException, IntituleException, StockException {
        //
        assertDoesNotThrow( () -> {new Article("article", 2.0, 100).removeQuantite(100);},
                "On ne peut pas acheter d’articles si le stock n’est pas suffisant"
        );

        //
        assertThrows(StockException.class,
                () -> {new Article("article", 2.0, 100).removeQuantite(150);},
                "On ne peut pas acheter d’articles si le stock n’est pas suffisant"
        );
    }
}