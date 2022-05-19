package command;

public class Plata implements OperatiuneBancara {
    private String contDestinatie;
    private Double suma;

    public Plata(String contDestinatie, Double suma) {
        this.contDestinatie = contDestinatie;
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("S-a efectuat o plata in contul " + this.contDestinatie + " cu suma de " + this.suma);
    }
}
