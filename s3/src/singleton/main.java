package singleton;

public class main {
    public static void main(String[] args) {

//      OShop os1 = new OShop();

        OShop os = OShop.getInstance();

        OShop os1 = OShop.getInstance();
        os1.setNume("Magazinul tau");

//      Ambele valori se vor modifica pentru ca avem aceeasi instanta
        System.out.println(os);
        System.out.println(os1);

    }
}
