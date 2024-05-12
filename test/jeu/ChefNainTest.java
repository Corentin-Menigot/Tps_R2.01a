package jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefNainTest {

    @Test
    void subirDegats() {
        ChefNain chefNain = new ChefNain();
        chefNain.subirDegats(40);
        assertEquals(chefNain.getPointDeVie(), 90, "Si un ChefNain reçoit des dégats, ils sont divisés par 4");
    }

    @Test
    void getRessourcesPourEntrainement() {
        ChefNain chefNain = new ChefNain();
        assertEquals(chefNain.getRessourcesPourEntrainement(), 3, "Les ressources nécessaires à l'entrainement d'un ChefNain sont de 3");
    }
}