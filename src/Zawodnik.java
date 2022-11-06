public class Zawodnik {
    private String imie;
    private String nazwisko;
    private int num_koszulki;


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNum_koszulki() {
        return num_koszulki;
    }

    public void setNum_koszulki(int num_koszulki) {
        this.num_koszulki = num_koszulki;
    }


    public String toString() {
        return "Zawodnik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", num_koszulki=" + num_koszulki +
                '}';
    }
}
