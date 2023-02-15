package Lab8;

public class Bank {

    private static Osoba[] tablicaOsob = new Osoba[20];
    private int n;

    public static void main(String[] args) {



        tablicaOsob[0] = new Pracownik();
        tablicaOsob[1] = new Pracownik("Kowalski","12323243432", "Administrator", 5000, 20);
        tablicaOsob[2] = new Pracownik("Nowak","85767493045", "Kasjer", 5000, 20);
        tablicaOsob[3] = new Pracownik("Kowel","9654340965", "Ksiegowy", 6000, 25);
        tablicaOsob[4] = new Pracownik("Jetora","654390543", "Kasjer", 1800, 14);
        tablicaOsob[5] = new Klient();
        tablicaOsob[6] = new Klient("Reterow", "432343567", 5);

        for (int i = 0; i < tablicaOsob.length; i++) {
            if(tablicaOsob[i] != null) {
                System.out.println(tablicaOsob[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Wyswietlenie pracownikow:");

WyswietlPracownikow();
        System.out.println(" ");
        System.out.println("Wyswietlenie Klientów z lokatami:");

        WyswietlKlientow();
        System.out.println("");

        IleKasjerow();

        System.out.println("");

        NajwiecejZarobil();

        System.out.println("");

        NajmniejZarobil();

    }

    public static void WyswietlPracownikow(){
        for (int i = 0; i < tablicaOsob.length; i++) {
            if(tablicaOsob[i] instanceof Pracownik){
                System.out.println(tablicaOsob[i]);
               ((Pracownik) tablicaOsob[i]).wyswietlLiczbeNadgodzin();
            }
        }
    }

    public static void WyswietlKlientow(){
        for (int i = 0; i < tablicaOsob.length; i++) {
            if(tablicaOsob[i] instanceof Klient){
                System.out.println(tablicaOsob[i]);
                ((Klient) tablicaOsob[i]).wyswietlLokaty();

            }
        }
    }

    public static void  IleKasjerow(){
        int ilosc = 0;
        for (int i = 0; i < tablicaOsob.length; i++) {
            if (tablicaOsob[i] instanceof Pracownik && ((Pracownik) tablicaOsob[i]).jestKasjerem()){
                ilosc ++;
            }
        }
        System.out.println("Ilość kasjerów: " + ilosc );
    }

    public static void NajwiecejZarobil(){
        double zarobki = 0;
        Pracownik zMaksZarobkiem = null;
        for (int i = 0; i < tablicaOsob.length; i++) {
            if(tablicaOsob[i] instanceof Pracownik){
             if(((Pracownik) tablicaOsob[i]).Oblicz()>zarobki)  {
                 zarobki = ((Pracownik) tablicaOsob[i]).Oblicz();
                 zMaksZarobkiem = (Pracownik) tablicaOsob[i];
             }

            }
        }

        System.out.println("Najwięcej zarabia: " + zMaksZarobkiem);
        System.out.println("Zarobki pracownika: " + zarobki);

    }

    public static void NajmniejZarobil(){
        double zarobki = Double.MAX_VALUE;
        Pracownik zMinZarobkiem = null;
        for (int i = 0; i < tablicaOsob.length; i++) {
            if(tablicaOsob[i] instanceof Pracownik){
                if(((Pracownik) tablicaOsob[i]).Oblicz()<zarobki)  {
                    zarobki = ((Pracownik) tablicaOsob[i]).Oblicz();
                    zMinZarobkiem = (Pracownik) tablicaOsob[i];
                }

            }
        }

        System.out.println("Najmniej zarabia: " + zMinZarobkiem);
        System.out.println("Zarobki pracownika: " + zarobki);

    }

}
