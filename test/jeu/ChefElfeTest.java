package jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChefElfeTest {

    @Test
    void getForce() {
        ChefElfe chefElfe = new ChefElfe();
        assertEquals(chefElfe.getForce(), 40, "La force d'un ChefElfe est de 4 fois la force d'un guerrier normal (40)");
    }

    @Test
    void getRessourcesPourEntrainement() {
        ChefElfe chefElfe = new ChefElfe();
        assertEquals(chefElfe.getRessourcesPourEntrainement(), 4, "Les ressources nécessaires à l'entrainement d'un ChefElfe sont de 4");
    }
}