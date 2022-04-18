package flyweight;

public abstract class Masina {
    private String roti;
    private String exterior;
    private String culoare;

    public Masina(String roti, String exterior, String culoare) {
        this.roti = roti;
        this.exterior = exterior;
        this.culoare = culoare;
    }

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getRoti() {
        return roti;
    }

    public String getExterior() {
        return exterior;
    }

    public String getCuloare() {
        return culoare;
    }

    public abstract void afiseaza();
}
