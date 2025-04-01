import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        ArrayList<Kniha> knihy = new ArrayList<>();

        //zadání
        System.out.println("ZADÁVEJ OBLÍBENÉ KNIHY. PRO UKONČENÍ ZADEJ MÍSTO NÁZVU KNIHY stop");
        System.out.println(" ");

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

        System.out.println(" ");
        System.out.println("Oblíbené knihy: ");
        for (Kniha kniha : knihy) {
            System.out.println("Kniha: " +kniha.getNazev()+ " autor: " +kniha.getAutor()+ " rok vydání: " +kniha.getRokVydani());
        }

        //změnění
        System.out.println(" ");
        System.out.println("CHCEŠ ZMĚNIT NĚKTERÝ NÁZEV KNIHY? - ano / ne");
        String zmenaJmena = sc.nextLine();

        switch (zmenaJmena) {
            case "ano":
                System.out.println("Jaký název knihy by jsi chtěl Změnit? - číslo 1 pro 1. knihu atd.");
                int zmena = sc.nextInt() -1;
                sc.nextLine();
                System.out.println("Napiš nové jméno");
                String novyNazev = sc.nextLine();
                knihy.get(zmena).setNazev(novyNazev);

                System.out.println("Oblíbení knihy po změně: ");
                for (Kniha kniha : knihy) {
                    System.out.println("Kniha: " +kniha.getNazev()+ " | autor: " +kniha.getAutor()+ " | rok vydání: " +kniha.getRokVydani());
                }
                break;
        }


        //podle autora
        System.out.println(" ");
        System.out.println("CHCEŠ ZOBRAZIT KNIHY PODLE AUTORA? - ano / ne");
        String zobrazitPodleAutora = sc.nextLine();

        switch (zobrazitPodleAutora) {
            case "ano":
                System.out.println("Od jakého autora chceš zobrazit knihy? - zadej jméno autora");
                String jmenoAutora = sc.nextLine();

                System.out.println("Výpis knih od autora " +jmenoAutora);
                for (Kniha kniha : knihy) {
                    if(jmenoAutora.equals(kniha.getAutor())){
                        System.out.println("Kniha: " +kniha.getNazev()+ " | autor: " +kniha.getAutor()+ " | rok vydání: " +kniha.getRokVydani());
                    }
                }
                break;
        }

        //vypsání knih od autora kterého je nejvíce
        ArrayList<String> jmenaAutoru = new ArrayList<>();
        for (Kniha kniha : knihy) {
            jmenaAutoru.add(kniha.getAutor());
        }












    }

}






