package ElementyGry;

import java.util.*;

public class Przeciwnik extends Postac {

    static {
        setNazwy();
    }

    private static List<String> nazwy = new ArrayList<String>();

    //lista losowych nazw
    private static List<String> setNazwy() {
        nazwy.add("WILKOŁAK");
        nazwy.add("WAMPIR");
        nazwy.add("ZOMBIE");
        nazwy.add("DUCH");
        nazwy.add("ORK");
        return nazwy;
    }

    public Przeciwnik() {
    }

    public static List<String> getNazwy() {
        return nazwy;
    }
//
//    public Postac stworzPrzeciwnika(Postac postac) {
//        Postac przeciwnik = new Postac();
//        Random rand = new Random();
//        przeciwnik.setImie(nazwy.get(rand.nextInt(nazwy.size()))); //losowanie z listynazw
//        przeciwnik.setLevel(postac.getLevel());
//         final Rasa[] VALUES = Rasa.values();
//        przeciwnik.setRasa(VALUES[rand.nextInt(Rasa.values().length)]);//losowanie
//        return przeciwnik;
//    }


//generowanie przeciwnka - lvl, losoanie nazwy, statystyki na podstawie stat gracza

}
