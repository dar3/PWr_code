public class Tablica2D_2 {


    public static int n = 20;
    public static int[][] tablica = new int[n][];

    public static void main(String[] args) {


        System.out.println("Ilość n (wierszy): " + n);


        int d = 0;

       for(int w = 0; w<n; w++)
       {
           // w liscie tworzymy nową listę w+1, aby zmiescily się tam wszystkie elementy, bo w - (numer wiersza) jest o jeden mniejszy od ilosci elementów które mają w nim być
           tablica[w] = new int[w+1];

           for (int k = 0; k<=w; k++)
           {
               tablica [w][k] = ++d;
           }

       }
        WypiszElementy();


    }


    private static void WypiszElementy() {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++){
                System.out.printf("%5d",tablica[i][j]);
//                System.out.print(tablica[i][j] + "\t");

            }

            System.out.println();
        }
    }

}


