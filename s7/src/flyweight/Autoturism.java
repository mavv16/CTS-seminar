package flyweight;

public class Autoturism extends Masina{
    private String suportBicicleta;

    public Autoturism(String roti, String exterior, String culoare,String suportBicicleta) {
        super(roti, exterior, culoare);
        this.suportBicicleta=suportBicicleta;
    }

    public String getSuportBicicleta() {
        return suportBicicleta;
    }

    @Override
    public void afiseaza() {
        System.out.println(this.getRoti()+","+this.getCuloare()+","+this.getExterior()+","+this.getSuportBicicleta());
    }
}
