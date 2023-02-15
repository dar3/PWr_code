package Cw6;

public class Obroza {

    private String kolor;
    private boolean czySkorzana;
    private boolean przeciwPchlom;

    public Obroza(String kolor, boolean czySkorzana, boolean przeciwPchlom) {
        this.kolor = kolor;
        this.czySkorzana = czySkorzana;
        this.przeciwPchlom = przeciwPchlom;
    }

    @Override
    public String toString() {
        return "Obroza{" +
                "kolor='" + kolor + '\'' +
                ", czySkorzana=" + czySkorzana +
                ", przeciwPchlom=" + przeciwPchlom +
                '}';
    }
}
