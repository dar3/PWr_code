import java.util.Random;

public class Z1C5_Tablica {

       public static int n = 10;
       public static int[] tab = new int[n];


    public static void main(String[] args) {

    Wypelnij();
    Wyswietl();
    Sortowanie();
    Posortowana();

    }

    public static void Wypelnij(){

        Random ran = new Random();
        for (int i = 0; i < tab.length; i++) {

            tab[i] = ran.nextInt(10)+1;
        }

    }

    public static void Wyswietl(){
        System.out.print("Nieposortowana_tablica = ");
        for (int i = 0; i < tab.length; i++) {

            System.out.print( + tab[i] + " ");
        }
        System.out.println();
    }
/*
10 5
temp = 10;
 pole z indeksem x z wartoscia 10 = 5 zamieniamy na wartosc 5 w tym miejscu
 5 5
 tab[j+1] = temp;
 wychodzi:  5 10

 */
    public static void Sortowanie(){
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length  - i - 1; j++) {
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }

            }

        }
    }

    public static void Posortowana(){
        System.out.print("Posortowana = ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }
}