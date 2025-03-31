import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        ArrayList<Kniha> knihy = new ArrayList<>();

        System.out.println("ZADÁVEJ OBLÍBENÉ KNIHY. PRO UKONČENÍ ZADEJ MÍSTO NÁZVU KNIHY stop");
        for(boolean i = false; !i ;) {
            System.out.println("Zadej název knihy:");
            String nazev = sc.nextLine();
            if (nazev.equals("stop")) {
                i = true;
            }else{
                nazev = nazev;
                System.out.println("Zadej autora knihy:");
                String autor = sc.nextLine();
                System.out.println("Zadej rok vydání knihy:");
                int rokVydani = sc.nextInt();
                sc.nextLine();
                System.out.println("");
                knihy.add(new Kniha(nazev, autor, rokVydani));
            }

        }

        System.out.println("Oblíbené knihy: ");
        for (Kniha kniha : knihy) {
            System.out.println("Kniha: " +kniha.getNazev()+ " autor: " +kniha.getAutor()+ " rok vydání: " +kniha.getRokVydani());
        }

        //odebírání
        System.out.println("Jaký název knihy by jsi chtěl Změnit? - číslo 1 pro 1. knihu atd.");
        int zmena = sc.nextInt() -1;
        sc.nextLine();
        System.out.println("Napiš nové jméno");
        String novyNazev = sc.nextLine();
        knihy.get(zmena).setNazev(novyNazev);

        System.out.println("Oblíbení knihy po změně: ");
        for (Kniha kniha : knihy) {
            System.out.println("Kniha: " +kniha.getNazev()+ " autor: " +kniha.getAutor()+ " rok vydání: " +kniha.getRokVydani());
        }























































    }









}






