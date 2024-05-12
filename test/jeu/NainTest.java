package jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NainTest {

    @Test
    void subirDegats() {
        Nain nain = new Nain();
        nain.subirDegats(40);
        assertEquals(nain.getPointDeVie(), 80, "Si un Nain reçoit des dégats, ils sont divisés par 2");
    }
}