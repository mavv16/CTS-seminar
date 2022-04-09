package factoryMethod;

import factoryMethod.factory.Factory;
import factoryMethod.factory.FactoryPachetCazare;
import factoryMethod.pachet.PachetTuristic;

public class main_factory_method {
    public static void main(String[] args) {
        Factory factory = new FactoryPachetCazare();
        PachetTuristic pachet = factory.crearePachet();
        pachet.afiseazaDetalii();
    }
}
