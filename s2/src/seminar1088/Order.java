package seminar1088;

import java.util.ArrayList;

class Order {
    private ArrayList<Product> products;
    private String adress;

    public Order() {
        products = new ArrayList<Product>();
    }

    public void add(Product p) {
        if (products.size() > 99)
            return;

        products.add(p);
    }

    public void remove(Product p) {
        products.remove(p);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

