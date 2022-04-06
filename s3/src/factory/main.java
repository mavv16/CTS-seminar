package factory;

public class main {
    public static void main(String[] args) {

        Car c1=CarFactory.createCar("ELECTRIC");
        Car c2=CarFactory.createCar("CLASSIC");

        c1.showInfo();
        c2.showInfo();
    }
}
