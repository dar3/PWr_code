package Lab9;

public class KartaSeniora extends  KartaKlienta{

    @Override
    public double rabat() {
        return 15.0;
    }

    @Override
    public String toString() {
        return "KartaSeniora " + "Nazwisko: " + getNazwisko();
    }

    public KartaSeniora() {
        super();
    }

    public KartaSeniora(int numer, String nazwisko) {
        super(numer, nazwisko);
    }
}
