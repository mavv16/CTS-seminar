package facade;

public class MasinaElectrica implements Automobil{
    private String incarcator;

    public MasinaElectrica(String incarcator) {
        this.incarcator = incarcator;
    }

    @Override
    public void getDescriere() {
        System.out.println("Masina electrica cu incarcator "+this.incarcator);
    }
}
