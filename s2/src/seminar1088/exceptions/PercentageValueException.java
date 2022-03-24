package seminar1088.exceptions;

public class PercentageValueException extends Exception{

    @Override
    public String getMessage() {
        return "Valoarea procentului trebuie sa fie intre intervalul (0,1)";
    }
}
