package adapter;

public class MasinaJucarie implements JucarieMobila {
    @Override
    public void seDeplaseaza() {
        System.out.println("se deplaseaza cu 0.5km pe ora");
    }

    @Override
    public void emiteSunete() {
        System.out.println("canta la multi ani");
    }
}
