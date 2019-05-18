package ElementyGry;

import streategia.PoziomStategia;
import streategia.Streategia;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu(Gracz gracz) {
        System.out.println("Witaj w grze tekstowej mmo!");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - Stwórz nową postać.");
        System.out.println("2 - Wybierz postać.");
        System.out.println("3 - Zasady gry");
        System.out.println("4 - wyjscie");
        int wybor = scanner.nextInt();

        System.out.println("Wybrałeś opcję: " + wybor);
        switch (wybor) {
            case 1:
                Postac postac = tworzeniePostaci();
                gracz.addToList(postac);
                menu(gracz);
                break;
            case 2:
                System.out.println("Wpisz imie postaci, ktora chcesz wybrac: ");
                scanner.nextLine();
                String imiePostaci = scanner.nextLine();
                menuPostaci(gracz, gracz.getMapaPostaci().get(imiePostaci));
                // menuPostaci(gracz,gracz.getListaPostaci().get(0));
                //wybor postaci po imieniu
                break;
            case 3:
//instrukcja
                menu(gracz);
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("Wybierz cyfry od 1 do 4");
                menu(gracz);
        }
    }

    public static void menuPostaci(Gracz gracz, Postac postac) {
        System.out.println("Co chcesz dalej zrobić?");
        System.out.println("2 - aktualne staystyki postaci");
        System.out.println("3 - walka");
        System.out.println("4 - zmiana imienia");
        System.out.println("5 - wyjscie do menu");
        int wybor2 = scanner.nextInt();
        switch (wybor2) {
            case 1:
                System.out.println("Wybierz postac: ");

            case 2:
                // System.out.println("Podaj imie postaci");
                statystyki(postac);
                menuPostaci(gracz, postac);
                break;
            case 3:
               // Przeciwnik przeciwnik = new Przeciwnik();

                Walka.przebiegWalki(postac,PostacFabryka.stworzPrzeciwnika(postac, new PoziomStategia(postac)));
                //System.out.println(przeciwnik);
                break;
            case 4:
                System.out.println("Wpisz nowe imie dla postaci: ");
                scanner.nextLine();
                postac.setImie(scanner.nextLine());
                menuPostaci(gracz, postac);
                break;
            case 5:
                menu(gracz);
            default:
                System.out.println("Wybierz cyfry od 1 lub 5");
                menuPostaci(gracz, postac);
        }
    }

    public static Postac tworzeniePostaci() {
        scanner.nextLine();
        System.out.println("Podaj imie postaci");
        String imie = scanner.nextLine();
        System.out.println("Wybierz rasę:");
        System.out.println("1 - " + Postac.Rasa.CZLOWIEK + " ; 2 - " + Postac.Rasa.ELF + " 3 - " + Postac.Rasa.KRASNOLUD + " ;");

        int rasa = scanner.nextInt();
        switch (rasa) {
            case 1:
                return PostacFabryka.stworzPostac(Postac.Rasa.CZLOWIEK, imie);
            case 2:
                return PostacFabryka.stworzPostac(Postac.Rasa.ELF, imie);
            case 3:
                return PostacFabryka.stworzPostac(Postac.Rasa.KRASNOLUD, imie);
            default:
                System.out.println("Wybierz cyfry od 1 lub 3");
                //   tworzeniePostaci();
        }

//        System.out.println("Wybierz profesje:");
//        System.out.println("1 - " + Gracz.Profesja.WOJOWNIK + " ; 2 - " + Gracz.Profesja.MAG + " 3 - " + Gracz.Profesja.ASASYN+ " ;");
//        int profesja = scanner.nextInt();
//        switch (profesja) {
//            case 1:
//                gracz.setProfesja(Gracz.Profesja.WOJOWNIK);
//                break;
//            case 2:
//                gracz.setProfesja(Gracz.Profesja.MAG);
//                break;
//            case 3:
//                gracz.setProfesja(Gracz.Profesja.ASASYN);
//                break;
//            default:
//                System.out.println("Wybierz cyfry od 1 lub 3");
//                tworzeniePostaci();
//        }


//gracz.statystyki();
        return null;
    }

    public static void statystyki(Postac postac) {

        System.out.println(postac);
    }
}
