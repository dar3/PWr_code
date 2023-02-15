package com.pwr.psio;

public class Herona {

    public static void main(String[] args) {

        int a, b ,c;
        a = 10;
        b = 5;
        c = 6;


        if ((Math.abs(b-c)<a) && a < (b+c)){

            double p = (a+b+c) / 2.0 ;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("pole: " + s);
        }

        else
        {

            System.out.println("nie da się utworzyc trójkąta");
        }
    }
}
