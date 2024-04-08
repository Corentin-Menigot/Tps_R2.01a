package tp5.tabledoperation;

public enum OperationEnum {
    //énumération
    ADDITION("addition"),
    SOUSTRACTION("soustraction"),
    MULTIPLICATION("multiplication");

    //attibuts de l'énumération
    private String libelle;

    //constructeur
    private OperationEnum(String libelle) {
        this.libelle = libelle;
    }
    @Override
    public String toString() {
        return libelle;
    }

}
