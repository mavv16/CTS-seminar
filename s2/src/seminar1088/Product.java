package seminar1088;

import seminar1088.exceptions.InvalidPriceValueException;
import seminar1088.exceptions.PercentageValueException;
import seminar1088.exceptions.StringMinLength;

class Product {
    private int id;
    private String name;
    private double price;
    private String description;
//    private String exp; //expiry date - only for goods


    public Product(int id, String name, double price, String description) throws StringMinLength, InvalidPriceValueException {
        this.id = id;
        if (this.name.length() < 5) {
            throw new StringMinLength();
        } else {
            this.name = name;
        }

        if (this.price > 0) {
            throw new InvalidPriceValueException();
        } else {
            this.price = price;
        }

        if (this.description.length() > 0) {
            throw new StringMinLength();
        } else {
            this.description = description;
        }
    }
    public Product(Product p) throws StringMinLength, InvalidPriceValueException {
        this.id = p.id;
        if (p.name.length() < 5) {
            throw new StringMinLength();
        } else {
            this.name = p.name;
        }

        if (p.price > 0) {
            throw new InvalidPriceValueException();
        } else {
            this.price = p.price;
        }

        if (p.description.length() > 0) {
            throw new StringMinLength();
        } else {
            this.description = p.description;
        }
    }

    public boolean equals(Product p) {
        if (p.id != this.id && !p.name.equals(this.name) && p.price != this.price && p.description != this.description)
            return false;
        return true;
    }

    public void applyPrecentageDiscount(float procent) throws PercentageValueException {//procentaj subunitar - > 0-1
        if (procent < 0 || procent > 1) {
            throw new PercentageValueException();
        } else {
            this.price += this.price * procent;
        }
    }

    public void applyAmountDiscount(double discount) {
        this.price -= discount;
    }

    public void increasePricePercentage(float increasePercentage) {
        this.price += this.price * increasePercentage;
    }

    public void increasePriceAmount(double increaseAmount) {
        this.price += increaseAmount;
    }

}
