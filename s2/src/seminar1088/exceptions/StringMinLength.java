package seminar1088.exceptions;

public class StringMinLength extends Exception{
    @Override
    public String getMessage() {
        return "Lungimea este prea mica!";
    }
}
