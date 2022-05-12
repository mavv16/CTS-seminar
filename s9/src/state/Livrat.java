package state;

public class Livrat implements State{
    @Override
    public void updateStare(ComandaMancare c) {
        System.out.println("Comanda a ajuns!");
    }
}
