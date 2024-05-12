package jeu;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChateauTest {

    @Test
    void ajoutGuerrierNovice() {
    }

    @Test
    void getGuerrierNovice() {
    }

    @Test
    void entrainer() {
    }

    @Test
    void getCouleur() {
        //
        Chateau chateau1 = new Chateau(Couleur.Rouge);
        assertEquals(chateau1.getCouleur(), Couleur.Rouge);

        //
        Chateau chateau2 = new Chateau(Couleur.Bleu);
        assertEquals(chateau2.getCouleur(), Couleur.Bleu);
    }

    @Test
    void estBleu() {
        //
        Chateau chateau1 = new Chateau(Couleur.Bleu);
        assertTrue(chateau1.estBleu());

        //
        Chateau chateau2 = new Chateau(Couleur.Rouge);
        assertFalse(chateau2.estBleu());
    }

    @Test
    void estRouge() {
        //
        Chateau chateau1 = new Chateau(Couleur.Rouge);
        assertTrue(chateau1.estRouge());

        //
        Chateau chateau2 = new Chateau(Couleur.Bleu);
        assertFalse(chateau2.estRouge());
    }
}