import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduceti o propozitie: \n");
        Scanner scanner = new Scanner(System.in);
        String linie = scanner.nextLine();

        try{
            if(linie.toLowerCase() == linie){
                throw new ExceptieLoweCase();
            }
            else if(linie.toUpperCase() == linie){
                throw new ExceptieUpperCase();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Ati introdus:" + linie);
        }
    }
}