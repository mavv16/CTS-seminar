package flyweight;

import java.util.HashMap;

public class MasinaFactory {
    private HashMap<TipMasina, Masina> mda = new HashMap<>();

    public Masina getMasina(TipMasina tipMasina) {
        Masina masina = null;

        if (mda.containsKey(tipMasina)) {
            masina = mda.get(tipMasina);
        } else {
            if (tipMasina == TipMasina.AutoGalben) {
                masina = new Autoturism("vara", "piele", "galben", "nu");
                mda.put(TipMasina.AutoGalben, masina);
            } else if (tipMasina == TipMasina.AutoRosu) {
                masina = new Autoturism("vara", "piele", "rosu", "nu");
                mda.put(TipMasina.AutoRosu, masina);
            } else if (tipMasina == TipMasina.CamionGalben) {
                masina = new Camion("vara", "piele", "galben", "da");
                mda.put(TipMasina.CamionGalben, masina);
            } else if (tipMasina == TipMasina.CamionRosu) {
                masina = new Camion("vara", "piele", "rosu", "da");
                mda.put(TipMasina.CamionRosu, masina);
            }
        }
        return masina;
    }
}
