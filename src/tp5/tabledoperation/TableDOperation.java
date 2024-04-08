package tp5.tabledoperation;

import java.util.ArrayList;

public class TableDOperation {
    //attributs de la classe
    private OperationEnum typeOperation;
    private ArrayList<Operation> operations = new ArrayList<>();
    private final int NBOPERATIONS = 5;

    //Constructeur de la classe
    public TableDOperation(OperationEnum typeOperation) {
        this.typeOperation = typeOperation;
        this.initialisation();
    }

    //méthodes et fonctions de la classe
    private void initialisation() {
        for (int i=0; i<NBOPERATIONS; i++) {
            if (this.typeOperation == OperationEnum.ADDITION) {
                operations.add(new Addition(Math.random() * NBOPERATIONS, Math.random() * NBOPERATIONS));
            } else if (this.typeOperation == OperationEnum.SOUSTRACTION) {
                operations.add(new Soustraction(Math.random() * NBOPERATIONS, Math.random() * NBOPERATIONS));
            } else if (this.typeOperation == OperationEnum.MULTIPLICATION) {
                operations.add(new Multiplication(Math.random() * NBOPERATIONS, Math.random() * NBOPERATIONS));
            }
        }
    }
    public int getNombreReponsesJustes() {
        int justes = 0;
        for (int i=0; i < this.getNombreDOperations(); i++) {
            if (operations.get(i).isReponseJuste()) {
                justes++;
            }
        }
        return justes;
    }
    public int getNombreDOperations() {
        return operations.size();
    }
    public Operation getOperation(int index) {
        return operations.get(index);
    }
}
