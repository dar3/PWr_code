package Wielomian;

public class Wielomian {

    public static double Hermite(int x, int n) {
        if (n==0)
        {
            return 1;
        }

        if (n==1){
            return 2*x;
        }

        int h0 = 1;
        int h1 = 2 * x;

        int h2 = 0;

        for (int i = 2; i <= n; i++) {
            h2 = 2 * x * h1 - 2 * h0 * (i-1);
            h0 = h1;
            h1 = h2;
        }

        return h2;
    }


}