package factoryMethod.factory;

import factoryMethod.pachet.PachetComplet;
import factoryMethod.pachet.PachetTuristic;

public class FactoryPachetComplet implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        PachetTuristic pachet = new PachetComplet();
        return pachet;
    }
}
