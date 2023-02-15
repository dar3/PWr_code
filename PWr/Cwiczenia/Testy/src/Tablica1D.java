import java.util.Random;

public class Tablica1D {

    private static int[] tablica = new int[10];

    public static void main(String[] args) {

    Wypelnij();
    Wyswietl();
    Sortuj();
        System.out.println(" ");
        System.out.println("Posortowane: ");
    Wyswietl();

    }

    public static void Wypelnij(){

        Random ran = new Random();

        for (int i = 0; i < tablica.length; i++) {

            tablica[i] = ran.nextInt(10)+1;

        }
    }

    public static void Wyswietl(){
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Indeks" + "[" + i + "]" + " " + tablica[i]);
        }
    }

    public static void Sortuj(){
        for (int k = 1; k <= tablica.length; k++) {
            for (int i = 0; i < tablica.length - 1; i++) {
                if(tablica[i] > tablica[i+1]){
                    int tmp = tablica[i];
                    tablica[i] = tablica[i+1];
                     tablica[i+1] = tmp;
                }

            }
        }
    }

}
