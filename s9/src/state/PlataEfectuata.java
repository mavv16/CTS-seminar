package state;

public class PlataEfectuata implements State{
    @Override
    public void updateStare(ComandaMancare c) {
        c.setState(new MancareInPreparare());
        System.out.println("S-a trecut in starea de mancare in preparare");
    }
}
