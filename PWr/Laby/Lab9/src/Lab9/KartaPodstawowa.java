package Lab9;

public class KartaPodstawowa extends KartaKlienta {

    @Override
    public double rabat(){

        return 0.0;
    }

    @Override
    public String toString() {
        return "KartaPodstawowa " + "Nazwisko: " + getNazwisko();
    }

    public KartaPodstawowa() {
        super();
    }

    public KartaPodstawowa(int numer, String nazwisko) {
        super(numer, nazwisko);
    }
}
