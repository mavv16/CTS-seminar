package state;

public class MancareInPreparare implements State{

    @Override
    public void updateStare(ComandaMancare c) {
        c.setState(new MancareGataDeLivarare());
        System.out.println("S-a trecut in starea manancare gata de livrare");
    }
}
