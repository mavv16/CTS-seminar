package proxy;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Proxy implements Internet{
    Internet ip = new InternetProvider();
    List<String> blacklists =  new ArrayList<>();

    public Proxy() {
        blacklists.add("http://facebook.com");
        blacklists.add("http://instagram.com");
    }

    @Override
    public void connectToUrl(String url) {
        if(this.blacklists.contains(url.toLowerCase())){
            System.out.println("Accesul interzis la adresa "+url);
        }else{
            ip.connectToUrl(url);
        }
    }
}
