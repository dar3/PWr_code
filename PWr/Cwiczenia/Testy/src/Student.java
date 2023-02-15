public class Student {

    private int wiek;
    private String imie;
    private  int indeks;

public Student(){
    wiek = 24;
    imie = "Kuba";
    indeks = 272678;
}
    public Student(int wiek, String imie, int indeks) {
        this.wiek = wiek;
        this.imie = imie;
        this.indeks = indeks;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }
}
