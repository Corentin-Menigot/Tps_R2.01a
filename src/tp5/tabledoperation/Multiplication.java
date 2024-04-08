package tp5.tabledoperation;

public class Multiplication extends Operation {
    //constructeur
    public Multiplication(double terme1, double terme2) {
        super(terme1, terme2);
    }

    //méthodes
    @Override
    public double calculResultat() {
        return super.getTerme1() * super.getTerme2();
    }
    @Override
    public String toString() {
        return super.getTerme1()+"*"+super.getTerme2();
    }
}
