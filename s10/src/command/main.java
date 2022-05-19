package command;

public class main {
    public static void main(String[] args) {
        OperatiuneBancara op1 = new Plata("Ro123", 200.02);
        OperatiuneBancara op2 = new Plata("Ro120", 2050.02);
        OperatiuneBancara op3 = new AlimentareCont("Ro123", 200.02);

        ServerOperatiuniBancare server = new ServerOperatiuniBancare();
        server.inregistrareOperatiune(op1);
        server.inregistrareOperatiune(op2);
        server.inregistrareOperatiune(op3);

        server.efectueazaOperatiuniInregistrare();
    }
}
