package com.pwr.psio;

public class If {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        double t;


        if(a>=b)

        {
            t = 2*a + Math.abs(b) - 1;
        }

        else
        {
            t = Math.sin(a) - Math.pow(b, b);
        }

        System.out.println(t);

        // moduł Math.abs(x);
        // sinus Math.sin(x);

    }
}
