

import java.util.Random;

public class Main {

    static int[][] generujMacierz() {
        Random random = new Random();
        int[][] M = new int[5][5];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(2);
            }
        }

        return M;
    }

    static void wyswietlMacierz(int[][] M) {
        System.out.print("\t");
        for (int i = 1; i <= M[0].length; i++) {
            System.out.print("x" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j <= M[i].length; j++) {
                if (j == 0) {
                    System.out.print("x" + (i + 1) + "\t");
                } else {
                    System.out.print(M[i][j - 1] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    static void wyswietlWlasnosc(String wlasnosc, boolean czyJest) {
        System.out.printf("%-24s", wlasnosc + ": ");
        if (czyJest) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }

    static boolean czyZwrotna(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            if (M[i][i] == 0)
                return false;
        }
        return true;
    }

    static boolean czySymetryczna(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1 && M[j][i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean czyPrzeciwzwrotna(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            if (M[i][i] == 1)
                return false;
        }
        return true;
    }

    static boolean czyPrzeciwsymetryczna(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 1 && M[j][i] == 1) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {

        int[][] M = generujMacierz();

        System.out.println("\nWylosowana macierz:");
        wyswietlMacierz(M);

        System.out.println("Własności relacji:");
        wyswietlWlasnosc("Zwrotność", czyZwrotna(M));
        wyswietlWlasnosc("Symetryczność", czySymetryczna(M));
        wyswietlWlasnosc("Przeciwzwrotność", czyPrzeciwzwrotna(M));
        wyswietlWlasnosc("Przeciwsymetryczność", czyPrzeciwsymetryczna(M));

    }
}
