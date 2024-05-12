package jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfeTest {

    @Test
    void getForce() {
        Elfe elfe = new Elfe();
        assertEquals(elfe.getForce(), 20, "La force d'un Elfe est de 2 fois la force d'un guerrier normal (20)");
    }

    @Test
    void getRessourcesPourEntrainement() {
        Elfe elfe = new Elfe();
        assertEquals(elfe.getRessourcesPourEntrainement(), 2, "Les ressources nécessaires à l'entrainement d'un Elfe sont de 2");
    }
}