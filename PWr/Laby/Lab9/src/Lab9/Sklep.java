package Lab9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sklep {

    private static Transakcja[] trans = new Transakcja[100];

    public static void main(String[] args) throws IOException {

//        to do Scanner getting input from user, switch case for the menu and creating methods as in the task

        Scanner scan = new Scanner(System.in);
        System.out.println("Wybierz pozycję menu:");

        boolean wyjscie = false;
        while (!wyjscie) {
        System.out.println();
        System.out.println("1 - Wstaw do tablicy kilka transakcji z różnymi kartami" + "\n" +
        "2 - Wyświetl utworzone transakcje" + "\n" + "3 - Dodaj jedną transakcję" + "\n" + "4 - Policz ile było transakcji z KartąSeniora"
        + "\n" + "5 - Wyświetl klienta z KartąStudenta, który zapłacił najwięcej " + "\n" + "6 - Zapisz do pliku tekstowego transakcje z użyciem KartyStudenta"
        + "\n" + "7 - Zakończ program");

        int option = scan.nextInt();
            switch (option) {
                case 1:
                    RozneKarty();
                    break;
                case 2:
                    WyswietlTransakcje();
                    break;
                case 3:
                    DodajTransakcje();
                    break;
                case 4:
                    TransakcjeZKartaSeniora();
                    break;
                case 5:
                    WyswietlStudentMax();
                    break;
                case 6:
                    ZapisDoPliku();
                    break;
                case 7:
                    wyjscie = true;
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
    }

    public static void RozneKarty(){
        trans[0] = new Transakcja(200, new KartaPodstawowa(123, "Kowalski"));
        trans[1] = new Transakcja(500, new KartaStudenta(234, "Nowak"));
        trans[2] = new Transakcja(1000, new KartaSeniora(343, "Redore"));
        trans[3] = new Transakcja(1200, new KartaSeniora(345, "Sowak"));
        trans[4] = new Transakcja(300, new KartaStudenta(798,"Szytor"));
    }

    public static void WyswietlTransakcje(){
        for (int i = 0; i < trans.length; i++) {
            if(trans[i]!= null){
            System.out.println(trans[i]);
            }
        }
    }
    public static void DodajTransakcje(){
        Transakcja transakcja = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kwotę");
        double kwota = sc.nextDouble();
        System.out.println("Podaj nazwisko");
        sc.nextLine();
        String nazwisko = sc.nextLine();
        System.out.println("Podaj kartę");
        System.out.println(" 1 - Karta Podstawowa" + "\n 2 - Karta Studenta \n 3 - Karta Seniora" );
        int karta = sc.nextInt();
        switch (karta){
            case 1:
                transakcja = new Transakcja(kwota, new KartaPodstawowa(123,  nazwisko));
                break;
            case 2:
                transakcja = new Transakcja(kwota, new KartaStudenta(555, nazwisko));
                break;
            case 3:
                transakcja = new Transakcja(kwota, new KartaSeniora(243, nazwisko));
                break;
            default:
                System.out.println("Nie ma takiej karty");
        }
        if(Transakcja.getNumerTransakcji() < trans.length){
            trans[Transakcja.getNumerTransakcji()] = transakcja;
        }

    }

    public static void TransakcjeZKartaSeniora(){
        int iloscTransakcjiZKartaSeniora = 0;
        for (int i = 0; i < trans.length; i++) {
            if (trans[i]!=null){
                if (trans[i].getKarta() instanceof KartaSeniora){
                    iloscTransakcjiZKartaSeniora++;
                }
            }
        }
        System.out.println("Ilość transakcji z kartą seniora: " + iloscTransakcjiZKartaSeniora);
    }

    public static void  WyswietlStudentMax(){
        double zaplacilMax = 0;
        Transakcja studentMax = null;
        for (int i = 0; i < trans.length; i++) {
            if (trans[i]!=null){
                if (trans[i].getKarta() instanceof KartaStudenta){
                    if(trans[i].getKwota()>zaplacilMax){
                        zaplacilMax = trans[i].getKwota();
                        studentMax = trans[i];
                    }

                }
            }
        }
        System.out.println(studentMax);
    }

    public static void ZapisDoPliku() throws IOException {
        File plik = new File("Transakcje.txt");

        FileWriter fileWriter = new FileWriter(plik);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < trans.length; i++) {
            if (trans[i] != null) {
                if (trans[i].getKarta() instanceof KartaStudenta) {
                    bufferedWriter.write(trans[i].toString() + "\n");
                }
            }

        }
        bufferedWriter.flush();
        bufferedWriter.close();
        fileWriter.close();
    }

}
