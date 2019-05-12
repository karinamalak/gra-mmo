package ElementyGry;

public class Postac {

    public enum Profesja {
        WOJOWNIK, MAG, ASASYN;

    }

    public enum Rasa {
        ELF, CZLOWIEK, KRASNOLUD
    }

    private Profesja profesja;
    private Rasa rasa;
    private String imie;
    public String getImie() {
        return imie;
    }


    public void setImie(String imie) {
        this.imie = imie;
    }

    public Profesja getProfesja() {
        return profesja;
    }

    public void setProfesja(Profesja profesja) {
        this.profesja = profesja;
    }

    public Rasa getRasa() {
        return rasa;
    }

    public void setRasa(Rasa rasa) {
        this.rasa = rasa;
    }

    //statystyki
    private int level;
    public final int maxLevel = 5;
    private int zycie;
    private int doswiadczenie;
    private int sila;
    private int obrona;
    private int zwinnosc;
    private int szczescie;
    private int atak;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getZycie() {
        return zycie;
    }

    public void setZycie(int zycie) {
        this.zycie = zycie;
    }

    public int getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getObrona() {
        return obrona;
    }

    public void setObrona(int obrona) {
        this.obrona = obrona;
    }

    public int getZwinnosc() {
        return zwinnosc;
    }

    public void setZwinnosc(int zwinnosc) {
        this.zwinnosc = zwinnosc;
    }

    public int getSzczescie() {
        return szczescie;
    }

    public void setSzczescie(int szczescie) {
        this.szczescie = szczescie;
    }

    public int getAtak() {
        return atak;
    }

    public void setAtak(int atak) {
        this.atak = atak;
    }


    public void UpLvl() {
        atak *= 0.2;
        sila *= 0.2;
        zycie *= 0.2;
        obrona *= 0.2;

    }
    @Override
    public String toString() {
        return "Postac{" +
                "rasa=" + rasa +
                ", imie='" + imie + '\'' +
                ", level=" + level +
                ", zycie=" + zycie +
                ", doswiadczenie=" + doswiadczenie +
                ", sila=" + sila +
                ", obrona=" + obrona +
                ", atak=" + atak +
                '}';
    }

}
