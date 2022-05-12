package state;

import java.util.List;

public class ComandaMancare {
    private State state;
    private int nrComanda;

    public ComandaMancare(int nrComanda) {
        this.state = new ComandaPlasata();
        this.nrComanda = nrComanda;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState() {
        if (!(this.state instanceof Livrat)) {
            state.updateStare(this);
        } else {
            System.out.println("Comanda a ajuns!(if)");
        }
    }
}
