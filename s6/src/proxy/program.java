package proxy;

public class program {
    public static void main(String[] args) {
        Internet ip = new InternetProvider();
        ip.connectToUrl("http://facebook.com");

        Internet proxy = new Proxy();
        proxy.connectToUrl("http://facebook.com");
        proxy.connectToUrl("http://instagram.com");
        proxy.connectToUrl("http://google.com");
    }
}
