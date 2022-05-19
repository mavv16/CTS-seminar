package command;

public class AlimentareCont implements OperatiuneBancara{
    private String contBancar;
    private Double suma;

    public AlimentareCont(String contBancar, Double suma) {
        this.contBancar = contBancar;
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("S-a alimentat contul "+this.contBancar+" cu suma de "+this.suma);
    }
}
