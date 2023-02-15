public class Tablica2D {

    // n to ilosc wierszy
// k to ilosc kolumn
    public static int n = 5;
    public static int k;
    public static int[][] tablica = new int[n][];

    public static void main(String[] args) {
        Ilekolumn();

        System.out.println("Ilość n (wierszy): " + n);
        System.out.println("Długość tablicy: " + tablica.length);

        int d = 0;
        for (int i = 0; i < tablica.length; i++) {
            tablica[n][k] = d++;
        }

        WypiszElementy();


    }

    public static void Ilekolumn() {
        for (int i = 1; i <= n; i++) {
            k = k + 1;
        }

        System.out.println("Ilość k (kolumn): " + k);
    }

    private static void WypiszElementy() {
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(i + " : " + tablica[i]);
        }
    }

}
