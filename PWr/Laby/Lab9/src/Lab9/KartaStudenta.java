package Lab9;

public class KartaStudenta extends  KartaKlienta{

//        0.1 = 10/100

    public double rabat(){
        return 10.0;
    }

    @Override
    public String toString() {
        return "KartaStudenta " + "Nazwisko: " + getNazwisko() ;
    }

    public KartaStudenta() {
        super();
    }

    public KartaStudenta(int numer, String nazwisko) {
        super(numer, nazwisko);
    }
}
