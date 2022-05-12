package state;

public class ComandaInCursDeLivrare implements State{
    @Override
    public void updateStare(ComandaMancare c) {
        c.setState(new Livrat());
        System.out.println("S-a trecut in starea de comanda livrata");
    }
}
