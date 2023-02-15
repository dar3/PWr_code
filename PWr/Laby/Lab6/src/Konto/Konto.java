package Konto;

public class Konto {

    private Waluta waluta;
    private boolean jestAktywne = false;

    public Konto() {

    }

    public Konto(Waluta waluta, boolean jestAktywne) {
        this.waluta = waluta;
        this.jestAktywne = jestAktywne;
    }

    public Waluta getWaluta() {
        return waluta;
    }

    public void setWaluta(Waluta waluta) {
        this.waluta = waluta;
    }

    public boolean isJestAktywne() {
        return jestAktywne;
    }

    public void setJestAktywne(boolean jestAktywne) {
        this.jestAktywne = jestAktywne;
    }

    public String getStan(){
        String a = "waluta=" + getWaluta().getNazwa_waluty() + " jestAktywne=" + isJestAktywne();

        return a;
    }

    public void aktywuj(){

        setJestAktywne(true);
    }

    public void dezaktywuj(){

        setJestAktywne(false);

    }
}
