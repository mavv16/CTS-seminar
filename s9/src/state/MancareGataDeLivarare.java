package state;

public class MancareGataDeLivarare implements State{
    @Override
    public void updateStare(ComandaMancare c) {
        c.setState(new ComandaInCursDeLivrare());
        System.out.println("S-a trecut in starea de comanda in curs de livarare");
    }
}
