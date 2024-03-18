package tp2.contraintes;

public class TestContrainte {
    public static void main(String[] args) {
//        ReelContraint contrainte = ContrainteUtilitaire.saisir(1.5, 9.6);
//        System.out.println(contrainte);
        Note note1 = new Note();
        Note note2 = new Note(13.2);
        Note note3 = ContrainteUtilitaire.saisir();

        note1.setValeur(12.4);

        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}
