package builder;

public class BuilderAutoturismElectric implements BuilderMasina {
    private Masina auto;

    public BuilderAutoturismElectric() {
        auto = (Masina) new AutoturismElectric();
    }

    @Override
    public void buildSasiu(String sasiu) {
        this.auto.setSasiu(sasiu);
    }

    @Override
    public Masina getMasina() {
        return this.auto;
    }

    @Override
    public void buildRoti(String roti) {
        this.auto.setRoti(roti);
    }

    @Override
    public void buildMotor(String motor) {
        this.auto.setMotor(motor);
    }

    @Override
    public void buildInterior(String interior) {
        this.auto.setInterior(interior);
    }
}
