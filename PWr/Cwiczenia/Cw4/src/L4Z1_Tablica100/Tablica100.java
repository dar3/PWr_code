package L4Z1_Tablica100;

import java.util.Random;

public class Tablica100 {

    public static int n = 100;

    public  static int[] tablica1 = new int[n];

    public static Random rand = new Random();

    public static void LosoweWartosci(){


    for(int i = 0; i<n; i++)
    {
        tablica1[i] = rand.nextInt(100)+1;
        System.out.println("Indeks [" +   i + "] = " +  tablica1[i]);
    }

    }

    public static int MaxWartosc(){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < tablica1.length; i++){

            if(tablica1[i] > max){

                max = tablica1[i];
            }

        }

        return max;
    }
    public static int MinWartosc(){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < tablica1.length; i++){

            if(tablica1[i] < min){

                min = tablica1[i];
            }

        }

        return min;
    }

    public static double Srednia(){

        double licznik = 0;
        double wynik;

        for (int i = 0; i < tablica1.length; i++) {

            licznik = licznik + tablica1[i];
        }

        wynik = licznik/tablica1.length;

        return wynik;
}

    public static int[] Parzyste(){

        int ile = 0;

        for (int i = 0; i < tablica1.length; i++) {

            if(tablica1[i] %2 == 0){
                ile++;

            }

        }
        int[] parzyste = new int[ile];
        int start = 0;

        for (int i = 0; i < tablica1.length; i++) {

            if(tablica1[i] %2 == 0){
                parzyste[start] = tablica1[i];
                start++;
            }
        }

return parzyste;

}


    public static void main(String[] args) {

        LosoweWartosci();
        System.out.println("Max: " + MaxWartosc());
        System.out.println("Min: " + MinWartosc());
        System.out.println("Średnia: " + Srednia());

        for(int i = 0; i<Parzyste().length; i++){
            System.out.println("Parzyste [" + i +"] = " + Parzyste()[i]);
        }


    }
}
