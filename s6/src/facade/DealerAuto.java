package facade;

public class DealerAuto {
    Automobil mf = null;
    Automobil ms = null;
    Automobil me = null;

    public DealerAuto() {

    }

    public void getDescriereMF() {
        if (mf == null) {
            mf = new MasinaDeFamilie(true);
        }
        mf.getDescriere();
    }

    public void getDescriereMS() {
        if (ms == null) {
            ms = new MasinaSport("TS3400");
        }
        ms.getDescriere();
    }

    public void getDescriereME() {
        if (me == null) {
            me = new MasinaElectrica("5000");
        }
        me.getDescriere();
    }


}
