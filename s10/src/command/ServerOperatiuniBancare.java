package command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {
    private List<OperatiuneBancara> operatiuni = new ArrayList<>();//asteptare

    public void inregistrareOperatiune(OperatiuneBancara operatiune) {
        operatiuni.add(operatiune);
    }

    public void efectueazaOperatiuniInregistrare() {
//        for (int index = 0; index < operatiuni.size(); index++) {
//            operatiuni.get(index).efectuareOperatiune();
//        }
//        operatiuni.clear();

//        AVEM .ConcurrentModificationException
        for(OperatiuneBancara op:operatiuni){
            op.efectuareOperatiune();
            operatiuni.remove(op);
        }
    }
}

