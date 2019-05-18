package ElementyGry;

import streategia.PoziomStategia;
import streategia.Streategia;

import java.util.Random;

public class PostacFabryka {

    public static Postac stworzPostac(Postac.Rasa rasa, String imie, Streategia streategia) {
        Postac postac = new Postac();
        postac.setImie(imie);
        postac.setLevel(1);
        wyborRasy(rasa,postac);

        if (postac.getLevel()>1) {
            postac.setAtak(postac.getAtak() * (postac.getLevel() + 0.3));
            postac.setObrona(postac.getObrona() * (postac.getLevel() + 0.3));
            postac.setSila(postac.getSila() * (postac.getLevel() + 0.3));
            postac.setZycie(postac.getZycie() * (postac.getLevel() + 0.3));
        }
        return postac;
    }
    public static Przeciwnik stworzPrzeciwnika(Postac postac, Streategia streategia){

        Przeciwnik przeciwnik = new Przeciwnik();
        Random rand = new Random();
        przeciwnik.setImie(przeciwnik.getNazwy().get(rand.nextInt(przeciwnik.getNazwy().size()))); //losowanie z listynazw
        przeciwnik.setLevel(postac.getLevel());
        final Postac.Rasa[] VALUES = Postac.Rasa.values();
        przeciwnik.setRasa(VALUES[rand.nextInt(Postac.Rasa.values().length)]);//losowanie
        wyborRasy(przeciwnik.getRasa(),przeciwnik);
        if (postac.getLevel()>1) {
            przeciwnik.setAtak(przeciwnik.getAtak() * (przeciwnik.getLevel() + 0.3)+(przeciwnik.getAtak() * (przeciwnik.getLevel() + 0.3)*((rand.nextInt(10)+1)/100)));
            przeciwnik.setObrona(przeciwnik.getObrona() * (przeciwnik.getLevel() + 0.3)+(przeciwnik.getObrona() * (przeciwnik.getLevel() + 0.3)*((rand.nextInt(10)+1)/100)));
            przeciwnik.setSila(przeciwnik.getSila() * (przeciwnik.getLevel() + 0.3)+(przeciwnik.getSila() * (przeciwnik.getLevel() + 0.3)*((rand.nextInt(10)+1)/100)));
            przeciwnik.setZycie(przeciwnik.getZycie() * (przeciwnik.getLevel() + 0.3)+(przeciwnik.getZycie() * (przeciwnik.getLevel() + 0.3)*((rand.nextInt(10)+1)/100)));
        }
        //else if dla lvl 1

        //mnzenie razy randomowa waga od 0.01 do 0.05 dla kazdej statystyki
        return przeciwnik;

    }

    private static void tworzenieCzlowieka(Postac postac) {

        postac.setAtak(8);
        postac.setObrona(8);
        postac.setSila(6);
        postac.setZycie(10);
        postac.setRasa(Postac.Rasa.CZLOWIEK);
    }



    private static void tworzenieElfa(Postac postac) {
        postac.setAtak(6);
        postac.setObrona(6);
        postac.setSila(6);
        postac.setZycie(14);
        postac.setRasa(Postac.Rasa.ELF);
    }

    private static void tworzenieKrasnoluda(Postac postac) {
        postac.setAtak(10);
        postac.setObrona(8);
        postac.setSila(8);
        postac.setZycie(6);
        postac.setRasa(Postac.Rasa.KRASNOLUD);
    }

    public static Postac wyborRasy(Postac.Rasa rasa, Postac postac) {

        switch (rasa) {
            case CZLOWIEK:
                 tworzenieCzlowieka(postac);
                break;
            case ELF:
                 tworzenieElfa(postac);
                break;
            case KRASNOLUD:
                 tworzenieKrasnoluda(postac);
                break;

        }

    }


}
