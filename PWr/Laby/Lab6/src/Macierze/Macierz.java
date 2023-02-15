package Macierze;

public class Macierz {

    public static int[][] Mnozenie(int[][] macierzA, int[][] macierzB){
        int n = macierzA.length;
        int m = macierzB[0].length;

        int[][] macierzC = new int[n][m];

        for (int w = 0; w < macierzC.length; w++) {

            for (int k = 0; k < macierzC[0].length ; k++) {

                int suma = 0;

                for (int i = 0; i < macierzA[0].length; i++) {

                    suma = suma + (macierzA[w][i] * macierzB[i][k]);

                }

                macierzC[w][k] = suma;
                System.out.printf("%5d",macierzC[w][k]);
            }
            System.out.println();
        }


        return macierzC;
    }


}
