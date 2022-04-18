package flyweight;

public class program {
    public static void main(String[] args) {
        MasinaFactory factory = new MasinaFactory();
        Masina masinaNoua = factory.getMasina(TipMasina.AutoGalben);
        masinaNoua.afiseaza();

        Masina masinaVeche = factory.getMasina(TipMasina.AutoGalben);
        masinaVeche.afiseaza();

        masinaNoua.setCuloare("verde");
        masinaNoua.afiseaza();
        masinaVeche.afiseaza();

        Masina camion1 = factory.getMasina(TipMasina.CamionGalben);
        camion1.afiseaza();

    }
}
