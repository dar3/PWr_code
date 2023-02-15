import java.util.*;

public class Wielokaty {
    private static Wielokaty wielokaty;
    private static Scanner scanner;
    private static String kolor;
    private static int a;
    private static int b;

    private List<Figura> list;

    private Comparator<Figura> comparatorColor;

    private Comparator<Figura> comparatorBok;
    private Comparator<Figura> comparatorColor_i_Bok;

    public Wielokaty() {
        this.list = new ArrayList<Figura>();
    }

    public static class ColorCompare {
        public static Comparator<Figura> createComparator() {
            return new Comparator<Figura>() {
                @Override
                public int compare(Figura o1, Figura o2) {
                    return o1.kolor.compareTo(o2.kolor);
                }
            };
        }
    }

    public static class BokCompare {
        public static Comparator<Figura> createComparator() {
            return new Comparator<Figura>() {
                @Override
                public int compare(Figura o1, Figura o2) {
                    return o1.a - o2.a;
                }
            };
        }
    }

    public static class Color_i_BokCompare {
        public static Comparator<Figura> createComparator() {
            return new Comparator<Figura>() {
                @Override
                public int compare(Figura o1, Figura o2) {
                    if (o1.kolor.compareTo(o2.kolor) == 0) {
                        return o1.a - o2.a;
                    }
                    return o1.kolor.compareTo(o2.kolor);
                }
            };
        }
    }

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        wielokaty = new Wielokaty();

        boolean zakoncz = false;

        while(!zakoncz) {
            switch (menuGlowne()) {
                case 0:
                    zakoncz = true;
                    break;
                case 1:
                    utworzycWielokat();
                    break;
                case 2:
                    wyswietlenieWszystkichWielokatow();
                    break;
                case 3:
                    sortowac();
                    break;
                case 4:
                    znajdzFigureZNajwiekszymObwodem();
                    break;
                default:
                    System.out.println("Nieprawid�owy wyb�r");
            }
        }
    }

    private static void znajdzFigureZNajwiekszymObwodem() {
        Figura figura = null;
        int najwiekszyjObwod = 0;
        int licznik = 0;
        int pozycja = 0;

        for (Figura x: wielokaty.list
             ) {
//            System.out.println(x + " ma obw�d: " + x.Obwod());
            licznik++;
            if (x.Obwod() > najwiekszyjObwod) {
                najwiekszyjObwod = x.Obwod();
                figura = x;
                pozycja = licznik;
            }
        }
        System.out.println("Najwiekszy obw�d ma:\n" + figura + " z obwodem: " + figura.Obwod() + " i pozycj w tabeli: " + pozycja);
    }

    private static void sortowac() {
        System.out.println("\tWybierz opcje:");
        System.out.println("1 - Sortowanie po kolorze");
        System.out.println("2 - Sortowanie po boku a");
        System.out.println("3 - Sortowanie po kolorze i boku a");

        switch(scanner.nextInt()) {
            case 1:
                sortowaniePoKoloru();
                break;
            case 2:
                sortowaniePoBoku_a();
                break;
            case 3:
                sortowaniePoKoloru_i_Boku();
                break;
            default:
                System.out.println("Nieprawidlowy wyb�r");
        }


    }

    private static void utworzycWielokat() {
        boolean wyjscie = false;
        while (!wyjscie) {
        System.out.println("\tWybierz opcje:");
        System.out.println("1 - Utworzyc domyslne wielokaty");
        System.out.println("2 - Utworzyc nowy prostokat");
        System.out.println("3 - Utworzyc nowy tr�jkat");
        System.out.println("0 - Wyjdz");
        switch (scanner.nextInt()) {
            case 0:
                wyjscie = true;
                break;
            case 1:
                wielokaty.list.add(new Trojkat("red", 4, 5, 6));
                wielokaty.list.add(new Prostokat("blue", 6, 5));
                wielokaty.list.add(new Trojkat("green", 3, 2, 4));
                wielokaty.list.add(new Prostokat("red", 6, 6));
                wielokaty.list.add(new Prostokat("yellow", 7, 3));
                wielokaty.list.add(new Trojkat("blue", 5, 6, 7));
                wielokaty.list.add(new Prostokat("green", 2, 9));
                break;
            case 2:
                menuProstokat();
                wielokaty.list.add(new Prostokat(kolor, a, b));
                break;
            case 3:
                menuProstokat();
                System.out.println("Wprowadz bok c:");
                int c = scanner.nextInt();
                wielokaty.list.add(new Trojkat(kolor, a, b, c));
                break;
            default:
                System.out.println("Nieprawidlowy wyb�r");
        }
        }
    }

    private static int menuGlowne() {
        System.out.println("\tWybierz opcje:");
        System.out.println("1- Utworzyc wielokat");
        System.out.println("2 - Wyswietlic wszystkie wielokaty");
        System.out.println("3 - Sortowac wielokaty");
        System.out.println("4 - Znajdz figure z najwiekszym obwodem");
        System.out.println("0 - Wyjdz");
        return scanner.nextInt();
    }

    private static void menuProstokat(){
        System.out.println("Wprowadz kolor:");
        kolor = scanner.next();
        System.out.println("Wprowadz bok a:");
        a = scanner.nextInt();
        System.out.println("Wprowadz bok b:");
        b = scanner.nextInt();
    }

    public static void sortowaniePoKoloru(){
        wielokaty.comparatorColor = ColorCompare.createComparator();
        System.out.println("\tSortowanie po kolorze:");
        Collections.sort(wielokaty.list, wielokaty.comparatorColor);
    }

    public static void sortowaniePoBoku_a(){
        wielokaty.comparatorBok = BokCompare.createComparator();
        System.out.println("\tSortowanie po boku a:");
        Collections.sort(wielokaty.list, wielokaty.comparatorBok);
    }

    public static void sortowaniePoKoloru_i_Boku(){
        wielokaty.comparatorColor_i_Bok = Color_i_BokCompare.createComparator();
        System.out.println("\tSortowanie po kolorze i po boku:");
        Collections.sort(wielokaty.list, wielokaty.comparatorColor_i_Bok);
    }

    private static void wyswietlenieWszystkichWielokatow() {
        for (Figura x: wielokaty.list
             ) {
            System.out.println(x);
        }
    }
}
