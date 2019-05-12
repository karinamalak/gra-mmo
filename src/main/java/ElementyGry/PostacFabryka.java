package ElementyGry;

public class PostacFabryka {

    public static Postac stworzPostac(Postac.Rasa rasa, String imie) {
        Postac postac = new Postac();
        postac.setImie(imie);
        postac.setLevel(1);
        switch (rasa) {
            case CZLOWIEK:
                return tworzenieCzlowieka(postac);
            case ELF:
                return tworzenieElfa(postac);
            case KRASNOLUD:
                return tworzenieKrasnoluda(postac);
                default:
                    return null;
        }
    }

    public static Postac tworzenieCzlowieka(Postac postac) {

        postac.setAtak(8);
        postac.setObrona(8);
        postac.setSila(6);
        postac.setZycie(10);
        postac.setRasa(Postac.Rasa.CZLOWIEK);
        return postac;
    }

    public static Postac tworzenieElfa(Postac postac) {
        postac.setAtak(6);
        postac.setObrona(6);
        postac.setSila(6);
        postac.setZycie(14);
        postac.setRasa(Postac.Rasa.ELF);
        return postac;
    }

    public static Postac tworzenieKrasnoluda(Postac postac) {
        postac.setAtak(10);
        postac.setObrona(8);
        postac.setSila(8);
        postac.setZycie(6);
        postac.setRasa(Postac.Rasa.KRASNOLUD);
        return postac;
    }


}
