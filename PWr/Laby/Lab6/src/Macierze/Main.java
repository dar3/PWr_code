package Macierze;


public class Main {


    public static void main(String[] args) {

        int[][] macierzA = {
                {-1, -2, 3},
                {0, 2, -1},
                {-1, 3, 0}
        };

        int[][] macierzB = {
                {4, 6, 10, 6},
                {9, 5, 2, 8},
                {1, 8, -5, 23}
        };

//     int[][] c =  Macierze.Mnozenie(macierzA, macierzB);
//        for (int i = 0; i < c.length; i++) {
//
//            for (int j = 0; j < c[0].length; j++) {
//
//                System.out.println(c[i][j]);
//
//
//            }
//
//
//        }


        Macierz.Mnozenie(macierzA, macierzB);

    }

}

