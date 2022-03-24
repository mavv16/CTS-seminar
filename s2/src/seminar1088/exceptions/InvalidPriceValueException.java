package seminar1088.exceptions;

public class InvalidPriceValueException extends Exception{

    @Override
    public String getMessage() {
        return "Pretul trebuie sa fie mai mare decat 0!";
    }
}
