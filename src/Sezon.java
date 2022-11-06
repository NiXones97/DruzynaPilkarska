public class Sezon {

    private int ilosc_druzyn;
    private int ilosc_zagr_meczy;
    private int porazki;
    private int punkty;


    public Sezon(int ilosc_druzyn, int ilosc_zagr_meczy, int porazki, int punkty) {
        this.ilosc_druzyn = ilosc_druzyn;
        this.ilosc_zagr_meczy = ilosc_zagr_meczy;
        this.porazki = porazki;
        this.punkty = punkty;
    }

    public int getIlosc_druzyn() {
        return ilosc_druzyn;
    }

    public void setIlosc_druzyn(int ilosc_druzyn) {
        this.ilosc_druzyn = ilosc_druzyn;
    }

    public int getIlosc_zagr_meczy() {
        return ilosc_zagr_meczy;
    }

    public void setIlosc_zagr_meczy(int ilosc_zagr_meczy) {
        this.ilosc_zagr_meczy = ilosc_zagr_meczy;
    }

    public int getPorazki() {
        return porazki;
    }

    public void setPorazki(int porazki) {
        this.porazki = porazki;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }


    public String toString() {
        return "Sezon{" +
                "ilosc_druzyn=" + ilosc_druzyn +
                ", ilosc_zagr_meczy=" + ilosc_zagr_meczy +
                ", porazki=" + porazki +
                ", punkty=" + punkty +
                '}';
    }
}
