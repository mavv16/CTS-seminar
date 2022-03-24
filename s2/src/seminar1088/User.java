package seminar1088;

import seminar1088.exceptions.IdentifierValueException;
import seminar1088.exceptions.StringMinLength;

import java.util.ArrayList;

class User {
    private int id;
    private String username;
    private String name;//nume de facturare
    private ArrayList<Order> orderHistory;
    private ShoppingCart cart;

    public User(int userId, String username, String name) throws StringMinLength, IdentifierValueException {
        if (this.id >= 1) {
            throw new IdentifierValueException();
        } else {
            this.id = userId;
        }

        if (this.username.length() >= 5) {
            throw new StringMinLength();
        } else {
            this.username = username;
        }

        if (this.name.length() >= 10) {
            throw new StringMinLength();
        } else {
            this.name = name;
        }

        orderHistory = new ArrayList<Order>();
    }

    public void addOrderToHistory(Order o) {
        this.orderHistory.add(o);
    }

    public void addProductToCart(Product p) {

    }
}

