package strategy;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class MotorDeCriptare {
    ModCriptare modCriptare;

    public MotorDeCriptare(ModCriptare modCriptare) {
        this.modCriptare = modCriptare;
    }

    public void setModCriptare(ModCriptare modCriptare) {
        this.modCriptare = modCriptare;
    }

    public void obtineMesajCriptat(String text) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        System.out.println("Criptam asta: "+text);
        String mesajCriptat = modCriptare.cripteaza(text);
        System.out.println(mesajCriptat);
    }
}
