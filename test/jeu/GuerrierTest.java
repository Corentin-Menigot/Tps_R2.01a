package jeu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {
    // Guerrier étant une classe abstraite on utilise pour la tester
    // les classes Nain (lorsqu'on veut utiliser l'attaque par défaut d'un guerrier)
    // et Elfe (lorsqu'on veut utiliser la résistance par défaut d'un guerrier)

    @Test
    void getForce() {
        Nain nain = new Nain();
        assertEquals(nain.getForce(), 10, "La force d'un Nain est de 10 (force de base)");
    }

    @Test
    void getPointDeVie() {
        Nain nain = new Nain();
        assertEquals(nain.getPointDeVie(), 100, "Les points de vie d'un Nain par défaut sont de 100 (points de vie de base)");
    }

    @Test
    void getRessourcesPourEntrainement() {
    }

    @Test
    void getCouleur() {
        //
        Nain nain1 = new Nain();
        nain1.setChateau(new Chateau(Couleur.Bleu));
        assertEquals(nain1.getCouleur(), Couleur.Bleu, "Si un Guerrier est BLEU il renvoit BLEU comme couleur");

        //
        Nain nain2 = new Nain();
        nain1.setChateau(new Chateau(Couleur.Bleu));
        assertNotEquals(nain2.getCouleur(), Couleur.Rouge, "Si un Guerrier est BLEU il ne renvoit pas ROUGE comme couleur");
    }

    @Test
    void setChateau() {
    }

    @Test
    void estVivant() {
        //
        Elfe elfe1 = new Elfe();
        assertTrue(elfe1.estVivant(), "Par défaut un Guerrier est vivant");

        //
        Elfe elfe2 = new Elfe();
        elfe2.subirDegats(100);
        assertFalse(elfe2.estVivant(), "Si un Guerrier prend 100 de dégats il n'est plus vivant");
    }

    @Test
    void estBleu() {
        //
        Nain nain1 = new Nain();
        nain1.setChateau(new Chateau(Couleur.Bleu));
        assertTrue(nain1.estBleu());

        //
        Nain nain2 = new Nain();
        nain2.setChateau(new Chateau(Couleur.Rouge));
        assertFalse(nain2.estBleu());
    }

    @Test
    void estRouge() {
        //
        Nain nain1 = new Nain();
        nain1.setChateau(new Chateau(Couleur.Rouge));
        assertTrue(nain1.estRouge());

        //
        Nain nain2 = new Nain();
        nain2.setChateau(new Chateau(Couleur.Bleu));
        assertFalse(nain2.estRouge());
    }

    @Test
    void attaquer() {
        Nain nain1 = new Nain();
        Nain nain2 = new Nain();
        nain1.attaquer(nain2);
        assertNotEquals(nain2.getPointDeVie(), 100, "Si un Guerrier neuf est attaqué il n'a plus 100 points de vie");
    }

    @Test
    void subirDegats() {
        Elfe elfe = new Elfe();
        elfe.subirDegats(10);
        assertEquals(elfe.getPointDeVie(), 90, "Si un Guerrier neuf subit 10 dégats il posséde 90 points de vie");
    }
}