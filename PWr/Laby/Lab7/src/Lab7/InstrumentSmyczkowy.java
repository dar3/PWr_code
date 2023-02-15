package Lab7;

public class InstrumentSmyczkowy extends Instrument {

    private int ls;

    public InstrumentSmyczkowy() {
        super("Stradivarius");
        ls = 1;
    }

    public InstrumentSmyczkowy(String nazwa, int a) {
        super(nazwa);
        ls = a;
    }
    @Override
    public String wydajDzwiek() {
        return "Smyk smyk smyk";
    }

    @Override
    public void graj() {
        for (int i = 0; i < ls; i++) {
            System.out.println(wydajDzwiek());
        }
    }

    @Override
    public String toString() {
        return "Instrument smyczkowy: " + nazwa + " ls=" + ls;
    }

    public boolean jestKontrabasem() {
        return nazwa.equals("kontrabas");
    }



    public int getIlosc() {
        return ls;
    }


}
