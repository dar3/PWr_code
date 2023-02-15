package com.pwr.psio;

import java.util.Scanner;
public class bankomat1 {

    static void menu()
    {
        System.out.println("___BANKOMAT___");

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz jedna z opcji");
        System.out.println("1 - wplata, 2 wyplata, 3 - sprawdzenie stanu konta");

        int opcja = sc.nextInt();
        switch(opcja)
        {
            case 1:
                System.out.println("Wpłata pieniędzy");
//                pin();
//                wplata();
                break;

            case 2:
                System.out.println("Wypłata pieniędzy");
//                pin();
//                wyplata();
                break;

            case 3:
                System.out.println("Sprawdzenie stanu konta");
//                pin();
//                stan();
                break;
            default:
                System.out.println("Brak takiej opcji");
        }
    }


    public static void main(String[] args) {

        menu();

    }

}
