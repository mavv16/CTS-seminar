package observer;

public class program {
    public static void main(String[] args) {
        UpdateServer server = new UpdateServer("TW1000");
        CarOs car1 = new CarOs();
        CarOs car2 = new CarOs();
        server.addObs(car1);
        server.addObs(car2);

        server.seeObservers();
        server.pushUpdates("TW2000");
        server.seeObservers();

        //TEMA: implementare exemplu folosind Observer si Observable din java(util)
        //set=updatePackge;     notifyObserver=pushUpdates
    }
}
