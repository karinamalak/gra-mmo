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
    private double zycie;
    private double doswiadczenie;
    private double sila;
    private double obrona;
    private double zwinnosc;
    private double szczescie;
    private double atak;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getZycie() {
        return zycie;
    }

    public void setZycie(double zycie) {
        this.zycie = zycie;
    }

    public double getDoswiadczenie() {
        return doswiadczenie;
    }

    public void setDoswiadczenie(int doswiadczenie) {
        this.doswiadczenie = doswiadczenie;
    }

    public double getSila() {
        return sila;
    }

    public void setSila(double sila) {
        this.sila = sila;
    }

    public double getObrona() {
        return obrona;
    }

    public void setObrona(double obrona) {
        this.obrona = obrona;
    }

    public double getZwinnosc() {
        return zwinnosc;
    }

    public void setZwinnosc(double zwinnosc) {
        this.zwinnosc = zwinnosc;
    }

    public double getSzczescie() {
        return szczescie;
    }

    public void setSzczescie(double szczescie) {
        this.szczescie = szczescie;
    }

    public double getAtak() {
        return atak;
    }

    public void setAtak(double atak) {
        this.atak = atak;
    }


//    public void UpLvl() {
//        atak *= 0.2;
//        sila *= 0.2;
//        zycie *= 0.2;
//        obrona *= 0.2;
//
//    }
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
