package Produkt;

public class Produkt {

    private int kod;
    private double cena;


    public Produkt() {
        kod = 0;
        cena = 0.0;
    }

    public Produkt(int kod, double cena){
        this.kod = kod;
        this.cena = cena;
    }

    public  int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public  double getCena() {
        return cena;
    }

    public  void setCena(double cena) {
        this.cena = cena;
    }

    public void getStan(){
        System.out.println("Kod: " + kod + " " + "Cena: " + cena);

    }
}
