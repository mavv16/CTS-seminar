package proxy;

public class InternetProvider implements Internet {
    @Override
    public void connectToUrl(String url) {
        System.out.println("Conectare cu succes la adresa " + url);
    }
}
