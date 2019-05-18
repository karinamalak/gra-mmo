package ElementyGry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gracz {

    private String login;
    private List<Postac> listaPostaci = new ArrayList<Postac>();
    private Map<String,Postac> mapaPostaci = new HashMap<String, Postac>();

    public List<Postac> getListaPostaci() {
        return listaPostaci;
    }

    public Map<String, Postac> getMapaPostaci() {
        return mapaPostaci;
    }

    public void setListaPostaci(List<Postac> listaPostaci) {
        this.listaPostaci = listaPostaci;
    }

    public void addToList(Postac postac) {
        listaPostaci.add(postac);
        mapaPostaci.put(postac.getImie(),postac);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //metoda zmiana lvlu
}
