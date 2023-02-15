package Konto;

public class Waluta {

    private int nazwa_waluty;

    public Waluta() {
    }

    public Waluta(int nazwa_waluty){

        this.nazwa_waluty = nazwa_waluty;
    }

    public int getNazwa_waluty() {
        return nazwa_waluty;
    }

    public void setNazwa_waluty(int nazwa_waluty) {
        this.nazwa_waluty = nazwa_waluty;
    }
}
