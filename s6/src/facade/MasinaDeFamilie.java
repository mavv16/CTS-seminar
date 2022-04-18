package facade;

public class MasinaDeFamilie implements Automobil{
    private boolean scaunCopil;

    public MasinaDeFamilie(boolean scaunCopil) {
        this.scaunCopil = scaunCopil;
    }

    @Override
    public void getDescriere() {
        if(scaunCopil){
            System.out.println("Masina de familie are scaun de copil");
        }else{
            System.out.println("Masina de familie nu are scaun de copil");
        }
    }
}
