package tp4.tabledemultiplication;

public class Multiplication {
    //attributs
    int terme1;
    int terme2;
    Integer reponseUtilisateur;

    //constructeurs
    public Multiplication(int terme1, int terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;
    }

    //méthodes
    public void setReponseUtilisateur(int reponse) throws ErreurMultiplicationException {
        this.reponseUtilisateur=reponse;
        if (!this.isReponseJuste()) {
            throw new ErreurMultiplicationException();
        }
    }
    public boolean isReponseJuste() {
        return reponseUtilisateur == terme1*terme2;
    }

    @Override
    public String toString() {
        return terme1+" × "+terme2+" = ";
    }
}
