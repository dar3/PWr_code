
package Projekt_Main;

import Konto.Konto;
import Konto.Waluta;

import java.util.Random;

public class Main {

    static Random g = new Random();
    private static int n = 5;
    private static Konto[] bank = new Konto[n];

    private static void Wyswietl(){

        for (int i = 0; i < bank.length; i++) {

            System.out.println("Konto o indeksie=" + i + " " + bank[i].getStan() );
        }
    }

    public static void main(String[] args) {


        for (int i = 0; i < bank.length ; i++) {

        bank[i] = new Konto(new Waluta(g.nextInt(4)+1), false);
        }
        Wyswietl();
        System.out.println();
       bank[0].aktywuj();
       bank[1].aktywuj();
        Wyswietl();
        System.out.println();
       bank[1].dezaktywuj();
       bank[2].aktywuj();
        Wyswietl();
        System.out.println();

    }
}
