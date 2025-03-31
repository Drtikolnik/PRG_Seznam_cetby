import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        ArrayList<String> nazvy = new ArrayList<>();

        System.out.println("ZADÁVEJ NÁZVY OBLÍBENÝCH KNIH. PRO UKONČENÍ ZADEJ stop");
        for(boolean i = false; !i ;) {
            System.out.println("zadej název knihy");
            String nazev = sc.nextLine();
            if (nazev.equals("stop")) {
                i = true;
            }else{
                nazvy.add(nazev);
            }
        }
        System.out.println("Názvy oblíbených knih: " + nazvy);

        //odebírání
        System.out.println("Jakou knihu by jsi chtěl odebrat? - číslo 1 pro 1. název atd.");
        int odebrani = sc.nextInt() -1;
        sc.nextLine();
        nazvy.remove(odebrani);
        System.out.println("Názvy oblíbených knih po odebrání: " + nazvy);























































    }









}






