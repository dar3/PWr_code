package com.pwr.psio;

public class Biggest_3 {

    public static void main(String[] args) {

        int a, b , c, x;
        a = 90;
        b = 30;
        c = 150;

        if (a>b && a>c)
        {
            x  = a;
            System.out.println("Największa liczba to: " + x);
        }

        else if (b>c)
        {
            x = b;
            System.out.println("Największa liczba to: " + x);
        }

        else
        {
            x = c;
            System.out.println("Największa liczba to: " + x);
        }


    }
}
