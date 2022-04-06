package factory;

public class ElectricCar implements Car{
    @Override
    public void showInfo() {
        System.out.println("electric");
    }
}
