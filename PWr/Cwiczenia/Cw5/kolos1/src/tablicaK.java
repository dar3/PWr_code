import java.util.Random;

public class tablicaK {

//    grupa 1



    private static int[] tab1 = new int[10];
    private static int[] tab2 = new int[20];

    private static int n;
   private static int [] tab_iloczyn = new int[n];




//    iloczyn to czesc wspolna tych 2 zbiorow


    public static void main(String[] args) {



        Wypelnij(tab1);
        Wypelnij(tab2);

        Powta(tab1);
        Powta(tab2);

        Wyswietl(tab1);
        Wyswietl(tab2);

        Iloczyn(tab1, tab2);
        System.out.println("tablica iloczyn");
        Wyswietl(tab_iloczyn);



    }


    private static void Wypelnij(int x []){

        Random ran = new Random();

        for (int i = 0; i < x.length; i++) {

            x[i] = ran.nextInt(100);
        }

    }

    private static void Wyswietl(int x []){
        for (int i = 0; i < x.length; i++) {
            System.out.println("Indeks: " + i + " " + x[i]);
        }
        System.out.println(" ");
    }


    private static void Iloczyn(int x [], int y []) {

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < y.length; j++) {
                if (i != j && x[i] == y[j]) {
                    if(x.length != 0){
                        n = x.length;
                        tab_iloczyn[i] = x[i];
                        System.out.println("Zbiór pusty");
                    }
                    else {
                        System.out.println("Zbiór niepusty");
                    }


                }
            }
        }
    }





    private static void Powta(int x []){
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1 ; j < x.length; j++) {
                if (x[i]==(x[j])) {
                    x[i] = x[j]-1;


                }
            }
        }
    }

}