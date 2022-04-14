package adapter;

public class Autoturism implements Masina {

    @Override
    public void ruleazaCuVitezaMare(){
        System.out.println("ruleaza pe drum");
    }

    @Override
    public void claxoneaza() {
        System.out.println("ruleaza cu viteza mare");

    }

}
