package L4Z4_Tablica2D;

import java.util.Random;

public class Tablica2D5 {

    final static int n = 5;

//    public static int [][] tab = new int[n][];

    public static void main(String[] args) {

        double [][] tab = new double[n][];

        tab[0] = new double[4];
        tab[1] = new double[2];
        tab[2] = new double[3];
        tab[3] = new double[2];
        tab[4] = new double[5];

//        Random generator2 = new Random();
//
//
//            int n = 5;
//            int [][] T = new int [n][];
//            int g = generator2.nextInt(10)+1;
//        for (int i = 0; i < n; i++) {
////            tab[i];
//        }
//
////            tab [n] [g] = [] [generator2.nextInt(10)+1];


        Tablica2D5 obT = new Tablica2D5();
        obT.wypelnijMacierz(tab);
        obT.drukujMacierz(tab);

        System.out.println("\n \n Max tablicy = " + obT.szukajMax(tab));



    }

    public void wypelnijMacierz(double [][] T){
        Random generator = new Random();

        for (int i =0; i<T.length; i++){
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = generator.nextDouble()*10;

            }
        }
    }

    public void drukujMacierz(double [][] T){
        for(int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.println("tab[" + i + "]" + "[" + j + "]" + " = " + T[i][j] + "\t");


            }
            System.out.println();
        }
    }

    public double szukajMax(double[][] T){
        double Max = T[0][0];

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                if(T[i][j] > Max) {
                    Max = T[i][j];
                }


            }
        }
        return Max;
    }

}
