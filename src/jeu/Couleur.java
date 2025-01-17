package jeu;

public enum Couleur {
    Bleu,
    Rouge;
    
    @Override
    public String toString() {
        // 34 bleu 31 rouge
        String couleur = "";
        if (this == Bleu) {
            couleur = "34";
        } else {
            couleur = "31";
        }
        return "\033[" + couleur + "m" + super.toString() + "\033[0m";
    }
}
