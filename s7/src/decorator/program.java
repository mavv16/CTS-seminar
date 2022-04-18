package decorator;

public class program {
    public static void main(String[] args) {
        Masina m = new MasinaPersonala();
        m.pornesteMotorul();

        Masina mi2 = new DecoratorMasinaInteligenta(new MasinaPersonala());
        mi2.pornesteMotorul();
    }
}
