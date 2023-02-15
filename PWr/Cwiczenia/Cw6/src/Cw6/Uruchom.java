package Cw6;

public class Uruchom {

    public static void main(String[] args) {

        Kot kot = new Kot();
        Kot kot2 = new Kot();
        Lew lew = new Lew();
        Pies pies = new Pies();
        Pies pies1 = new Pies();



        WeterynarzKotow weterynarz = new WeterynarzKotow();


        weterynarz.WykonajSzczepienie(kot2);
        weterynarz.WykonajSzczepienie(kot2);
        weterynarz.WykonajSzczepienie(lew);

        pies.KupObroze("Zielona", false, true);
        pies.KupObroze("Pomarańczowa", true, false);
        pies.KupObroze("Niebieska", true, false);
        pies.KupObroze("Czarna", true, false);


        kot.Ugryz(weterynarz);
        kot2.Ugryz(weterynarz);
        lew.Ugryz(weterynarz);
        System.out.println(kot.DajGlos());
        System.out.println(pies.DajGlos());

        for (int i = 0; i < pies.getObroze().length; i++) {
        System.out.println(pies.getObroze()[i]);

        }


    }
}
