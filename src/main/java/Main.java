import ElementyGry.Gracz;
import ElementyGry.Menu;
import ElementyGry.Postac;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Gracz gracz = new Gracz();
        System.out.println("Podaj swoj login");
        String login = scanner.nextLine();
        gracz.setLogin(login);
        Menu.menu(gracz);

     //   Postac postac = Menu.tworzeniePostaci();
      //  postac.
    }


}
