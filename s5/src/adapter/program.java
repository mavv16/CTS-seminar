package adapter;


public class program {
    public static void main(String[] args) {

        JucarieMobila jucarie = new AdapterMasina();
        jucarie.seDeplaseaza();
        jucarie.emiteSunete();
    }
}
