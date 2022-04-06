package singleton;

public class OShop {
    private static OShop instanta;
    private String nume;

    private OShop() {
        this.nume="Magazinul meu";
    }

    //sincrona pt ca la pornirea 3 thread-uri de ex trebuie sa se astepte sa nu se creeze de mai multe ori instanta
    //impiedicam suprapunerea
    public static synchronized OShop getInstance() {
        if (instanta == null) {
            instanta = new OShop();
        }
        return instanta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OShop{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
