package seminar1088;

import seminar1088.exceptions.InvalidPriceValueException;
import seminar1088.exceptions.StringMinLength;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop o = null;
        try {
            o = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());
        } catch (StringMinLength stringMinLength) {
            stringMinLength.printStackTrace();
        }

        Product p1 = null;
        try {
            p1 = new Product(1,"Laptop", 3200.5, "");
        } catch (StringMinLength stringMinLength) {
            stringMinLength.printStackTrace();
        } catch (InvalidPriceValueException e) {
            e.printStackTrace();
        }

        Product p2 = null;
        try {
            p2 = new Product(2,"Frigider", 207.95, "");
        } catch (StringMinLength stringMinLength) {
            stringMinLength.printStackTrace();
        } catch (InvalidPriceValueException e) {
            e.printStackTrace();
        }

        Product p3 = null;
        try {
            p3 = new Product(p1);
        } catch (StringMinLength stringMinLength) {
            stringMinLength.printStackTrace();
        } catch (InvalidPriceValueException e) {
            e.printStackTrace();
        }

        try {
            p3.setName("Paine");
        } catch (StringMinLength stringMinLength) {
            stringMinLength.printStackTrace();
        }

        o.modifyProductsList(1, p1);
        o.modifyProductsList(1, p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}
