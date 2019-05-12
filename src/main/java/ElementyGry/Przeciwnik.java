package ElementyGry;

import java.util.ArrayList;
import java.util.List;

public class Przeciwnik extends Postac {



//lista losowych nazw
private List<String> getNazwy() {
    List<String> nazwy = new ArrayList<String>();
    nazwy.add("WILKOŁAK");
    nazwy.add("WAMPIR");
    nazwy.add("ZOMBIE");
    nazwy.add("DUCH");
    nazwy.add("ORK");
    return nazwy;
}

//generowanie przeciwnka - lvl, losoanie nazwy, statystyki na podstawie stat gracza

}
