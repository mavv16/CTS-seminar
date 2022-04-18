package decorator;

public class DecoratorMasinaInteligenta extends DecoratorMasina{

    public DecoratorMasinaInteligenta(Masina decorated) {
        super(decorated);
    }

    @Override
    public void pornesteMotorul() {
        super.pornesteMotorul();
        incalzireScaune();
    }

    private void incalzireScaune() {
        System.out.println("Incalzirea din scaune a inceput..");
    }
}
