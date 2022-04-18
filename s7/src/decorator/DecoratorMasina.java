package decorator;

public abstract class DecoratorMasina implements Masina{
    protected Masina decorated;

    public DecoratorMasina(Masina decorated) {
        this.decorated = decorated;
    }

    @Override
    public void pornesteMotorul() {
        decorated.pornesteMotorul();
    }
}
