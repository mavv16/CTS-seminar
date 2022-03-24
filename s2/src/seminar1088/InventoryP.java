package seminar1088;

import seminar1088.exceptions.InvalidPriceValueException;
import seminar1088.exceptions.StringMinLength;

class InventoryP {
    private Product p;
    private int q;

    public InventoryP(Product p, int q) throws InvalidPriceValueException, StringMinLength {
        this.p = new Product(p);
        this.q = q;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}
