package com.pwr.psio;

public class piotr_zad2 {



        public static int l = 0, m = 0, wynikl = 0, wynikm = 1;

        public static void zad1() {
            int n = 3, m = 8;

            if(n % 2 == 0) n++;
            if(m % 2 == 0) m--;

            int suma = 0;
            for(int i = n; i <= m; i += 2)
                suma += i;

            System.out.println("Suma liczb nieparzystych z przedziału: " + suma);
        }

        public static void zad2() {
            int n = 5;

            double wynik = 1;

            for(int i = 1; i <= n; i++) {
                l();
                System.out.print(l);

                if(i < n) System.out.print(" + ");
            }
            System.out.println();

            for(int i = 0; i < 4 * n; i++) System.out.print("-");
            System.out.println();

            for(int i = 1; i <= n; i++) {
                m(i);
                System.out.print(m);

                if(i < n) System.out.print(" * ");
            }
            System.out.println();

            wynik = (double)wynikl / (double)wynikm;
            System.out.println(wynik);

        }

        public static int l() {
            l = l == 0 ? 2 : l + 3;
            wynikl += l;
            return l;
        }

        public static int m(int n) {
            m = m == 0 ? 3 : Math.abs(m) + 4;
            m *= n % 2 == 0 ? -1 : 1;
            wynikm *= m;
            return m;
        }


    public static void main(String[] args) {

        zad2();

    }

}
