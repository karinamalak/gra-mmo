package ElementyGry;

import javafx.geometry.Pos;

public class Walka {


    public static void przebiegWalki(Postac postac, Przeciwnik przeciwnik) {
        double obrazeniaPostac = 0;
        double obrazeniaPrzeciwnik = 0;

        while ((postac.getZycie() > 0) && (przeciwnik.getZycie() > 0)) {
            obrazeniaPostac = (postac.getSila() * postac.getAtak() - przeciwnik.getObrona())*0.3;
            obrazeniaPrzeciwnik = (przeciwnik.getSila() * przeciwnik.getAtak() - postac.getObrona())*0.3;


            System.out.println("Przeciwnik zadał: " + obrazeniaPrzeciwnik + " obrażeń");
            System.out.println("Twoja postać zadała: " + obrazeniaPostac + " obrażeń");
            System.out.println("Życie przeciwnika: " + (przeciwnik.getZycie()-obrazeniaPostac));
            System.out.println("Życie twojej postaci:  " + (postac.getZycie()-obrazeniaPrzeciwnik));

//+ wyliczenie doswiadczenia
        }
        System.out.println("Wynik walki: ");
        if (postac.getZycie() <= 0) System.out.println("Przegrałeś :( ");
        else if (przeciwnik.getZycie() <= 0) System.out.println("Wygrałeś :) ");


    }


}
