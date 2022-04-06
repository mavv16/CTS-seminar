public class ExceptieLoweCase extends Exception {
    @Override
    public String getMessage() {
        return "Toate litere sunt mici";
    }
}