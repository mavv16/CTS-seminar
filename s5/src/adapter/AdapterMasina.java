package adapter;

public class AdapterMasina implements JucarieMobila {
    Masina m;

    public AdapterMasina() {
        this.m = new Autoturism();
    }

    @Override
    public void seDeplaseaza() {
        m.ruleazaCuVitezaMare();
    }

    @Override
    public void emiteSunete() {
        m.claxoneaza();
    }
}
