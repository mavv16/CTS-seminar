package seminar1088.exceptions;

public class IdentifierValueException extends Exception{

    @Override
    public String getMessage() {
        return "Valoarea pentru identificator trebuie sa fie mai mare decat 1";//pt id uri
    }
}
