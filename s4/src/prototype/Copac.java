package prototype;

public class Copac implements Cloneable {
    private String tipCoroana;
    private int inaltime;
    private String culoare;
    private Locatie locatiePlantare;

    public Copac() {
        this.tipCoroana = "rotunda";
        this.inaltime = 20;
        this.culoare = "roz";
        this.locatiePlantare = new Locatie(0, 0);
    }

    public Copac(String tipCoroana, int inaltime, String culoare, Locatie locatie) {
        this.tipCoroana = tipCoroana;
        this.inaltime = inaltime;
        this.culoare = culoare;
        this.locatiePlantare = locatie;
    }

//    @Override
    protected Copac clone() {
        return new Copac(this.tipCoroana, this.inaltime, this.culoare, new Locatie(this.locatiePlantare.x, this.locatiePlantare.y));

//        Obiectele au aceeasi adresa -> Shallow copy
//        Copac clone = null;
//        try {
//            clone = (Copac) super.clone();//shallow copy
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return clone;
    }


    public void planteaza(Locatie loc) {
        this.locatiePlantare.x = loc.x;
        this.locatiePlantare.y = loc.y;
        System.out.println("Locatie x " + loc.x);
        System.out.println("Locatie y " + loc.y);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Copac{");
        sb.append("tipCoroana='").append(tipCoroana).append('\'');
        sb.append(", inaltime=").append(inaltime);
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append(", locatie=").append(locatiePlantare);
        sb.append('}');
        return sb.toString();
    }
}
