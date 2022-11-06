public class Mecz {
    private String czas;
    private String miejsce;
    private String wynik;
    private String faule;
    private String kartki;
    private int bramki;


    public Mecz(String czas, String miejsce, String wynik, String faule, String kartki, int bramki) {
        this.czas = czas;
        this.miejsce = miejsce;
        this.wynik = wynik;
        this.faule = faule;
        this.kartki = kartki;
        this.bramki = bramki;
    }

    public String getCzas() {
        return czas;
    }

    public void setCzas(String czas) {
        this.czas = czas;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public String getWynik() {
        return wynik;
    }

    public void setWynik(String wynik) {
        this.wynik = wynik;
    }

    public String getFaule() {
        return faule;
    }

    public void setFaule(String faule) {
        this.faule = faule;
    }

    public String getKartki() {
        return kartki;
    }

    public void setKartki(String kartki) {
        this.kartki = kartki;
    }

    public int getBramki() {
        return bramki;
    }

    public void setBramki(int bramki) {
        this.bramki = bramki;
    }

    @Override
    public String toString() {
        return "Mecz{" +
                "czas='" + czas + '\'' +
                ", miejsce='" + miejsce + '\'' +
                ", wynik='" + wynik + '\'' +
                ", faule='" + faule + '\'' +
                ", kartki='" + kartki + '\'' +
                ", bramki=" + bramki +
                '}';
    }
}
