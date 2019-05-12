package ElementyGry;

import java.util.ArrayList;
import java.util.List;

public class Gracz {

    private String login;
    private List<Postac> listaPostaci = new ArrayList<Postac>();

    public List<Postac> getListaPostaci() {
        return listaPostaci;
    }

    public void setListaPostaci(List<Postac> listaPostaci) {
        this.listaPostaci = listaPostaci;
    }

    public void addToList(Postac postac) {
        listaPostaci.add(postac);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //metoda zmiana lvlu
}
