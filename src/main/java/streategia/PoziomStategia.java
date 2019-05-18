package streategia;

import ElementyGry.Postac;

public class PoziomStategia implements Streategia {

    public Postac postac;

    public PoziomStategia(Postac postac) {
        this.postac = postac;
    }
    //tutaj wartosci statystyk x 3 metody ze wgledu na rase
    //podstategia przeciwnik
    //podtsategia prpfesja + wagi
    public double wartosc() {
       // return 10;
        if (postac.getLevel() >1) {
            return (this.postac.getLevel()+0.3) * 8;
        } else return 8;
    }



}
