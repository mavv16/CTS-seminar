package state;

public class ComandaPlasata implements State{
    @Override
    public void updateStare(ComandaMancare c) {
        c.setState(new PlataEfectuata());
        System.out.println("S-a trecut in starea de plata efectuata");
    }
}
