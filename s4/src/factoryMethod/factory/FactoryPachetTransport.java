package factoryMethod.factory;

import factoryMethod.pachet.PachetTransport;
import factoryMethod.pachet.PachetTuristic;

public class FactoryPachetTransport implements Factory{
    @Override
    public PachetTuristic crearePachet() {
        PachetTuristic pachet = new PachetTransport();
        return pachet;
    }
}
