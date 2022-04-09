package factoryMethod.factory;

import factoryMethod.pachet.PachetCazare;
import factoryMethod.pachet.PachetTuristic;

public class FactoryPachetCazare implements Factory {
    @Override
    public PachetTuristic crearePachet() {
        PachetTuristic pachet = new PachetCazare();
        return pachet;
    }
}
