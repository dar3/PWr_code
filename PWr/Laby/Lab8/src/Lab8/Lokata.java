package Lab8;

public class Lokata {

    private int nrLokaty;
    private double kwota;
    private boolean zerwana;

    public  Lokata(){
        nrLokaty = 0;
        kwota = 0;
        zerwana = false;
    }

    public Lokata(int nrLokaty, double kwota, boolean zerwana) {
        this.nrLokaty = nrLokaty;
        this.kwota = kwota;
        this.zerwana = zerwana;
    }

    public String toString(){
        return "Numer lokaty: " + nrLokaty + " " + "Kwota: " + kwota + " " + " Zerwana:" + " " + zerwana;
    }

    public int getNrLokaty() {
        return nrLokaty;
    }

    public void setNrLokaty(int nrLokaty) {
        this.nrLokaty = nrLokaty;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public boolean isZerwana() {
        return zerwana;
    }

    public void setZerwana(boolean zerwana) {
        this.zerwana = zerwana;
    }
}
