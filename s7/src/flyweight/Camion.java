package flyweight;

public class Camion extends Masina{
    private String remorca;

    public Camion(String roti, String exterior, String culoare,String remorca) {
        super(roti, exterior, culoare);
        this.remorca=remorca;
    }

    public String getRemorca() {
        return remorca;
    }

    @Override
    public void afiseaza() {
        System.out.println(this.getRoti()+","+this.getCuloare()+","+this.getExterior()+","+this.getRemorca());
    }
}
