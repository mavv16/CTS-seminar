package prototype;

import java.util.ArrayList;
import java.util.List;

public class main_prototype {
    public static void main(String[] args) {
        List<Copac> livada = new ArrayList<>();

        Copac copac = new Copac("cerc",10,"verde",new Locatie(10,10));
        livada.add(copac);

        Copac copie=copac.clone();
        copie.planteaza(new Locatie(100,100));
        livada.add(copie);

        System.out.println(livada);

    }
}
