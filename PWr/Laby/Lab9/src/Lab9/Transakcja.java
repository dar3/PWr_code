package Lab9;

public class Transakcja {

    private static int numerTransakcji = 0;

    private  int numer;
    private double kwota;
    private KartaKlienta karta;



    public Transakcja() {
        numer = numerTransakcji++;
        kwota = 0;
        karta = null;
    }

    public Transakcja(double kwota, KartaKlienta karta) {
        numer = numerTransakcji++;
        this.karta = karta;
        this.kwota = kwotaDoZaplaty(kwota);
    }

    @Override
    public String toString() {
        return "Transakcja{" + "numerTransakcji= " + numer + " kwota= " + kwota + ", karta= " + karta.toString();
    }

    public double kwotaDoZaplaty(double kwota){
        return kwota - ((karta.rabat()/100) * kwota);

    }

    public static int getNumerTransakcji() {
        return numerTransakcji;
    }

    public void setNumerTransakcji(int numer) {
        Transakcja.numerTransakcji = numer;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public KartaKlienta getKarta() {
        return karta;
    }

    public void setKarta(KartaKlienta karta) {
        this.karta = karta;
    }
}
