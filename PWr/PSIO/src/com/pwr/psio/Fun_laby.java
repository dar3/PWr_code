package com.pwr.psio;

public class Fun_laby {

    public static double funkcjaS(int n, double x) {
        double result = 0;
        if (x < -2) {
            result = Math.exp(x);

        }

        else if (x >= -2 && x <= 0) {
            result = 4 / 5.0;

        }

        else
        {
            long fact;
            result = 1; fact = 1;
            for(int i = 1; i <=n; i++)
            {
            fact *=i;
            result *= ((x+i)/fact);
            }
        }

        return result;
    }




    public static void main(String[] args) {

        System.out.println(funkcjaS(4, 6));

    }
}
