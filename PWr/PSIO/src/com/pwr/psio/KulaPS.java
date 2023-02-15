package com.pwr.psio;

import java.util.Scanner;

public class KulaPS {

    public static double poleKuli(int r)
    {

        double polek = 4*Math.PI*(r*r);

        return polek;
    }

    public static double objetoscKuli(int r)
    {

        double objkul = 4/3.0*Math.PI*(r*r*r);

        return objkul;
    }

    public static double poleProstopadloscianu(int a, int b, int c)
    {

        double polep = 2*(a*b+a*c+b*c);

        return polep;
    }

    public static double objProstopadloscianu(int a,int b, int c)
    {


        double objp = a*b*c;

        return objp;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj opcję: \n 1 - 'K:' Kula \n 2 - 'P:' Prostopadłościan \n 3 - 'S:' Stop");
        int opcja = sc.nextInt();

        switch (opcja)
        {
            case 1:
                System.out.println("K: Kula");
                System.out.println("Pole kuli: " + poleKuli(1) + "\nObjętość kuli: " + objetoscKuli(1));
                break;
            case 2:
                System.out.println("P: Prostopadłościan");
                System.out.println("Pole prostopadłościanu: " + poleProstopadloscianu(2,3,4) + "\nObjętość prostopadłościanu: " + objProstopadloscianu(2,3,4));
                break;
            case 3:
                break;
            default:
                System.out.println("Nie ma takiej opcji");
        }

    }

}
