package Produkt;


import java.util.Random;

public class Main {

//   private static int n = 5;

    public static void main(String[] args) {

//        Produkt p = new Produkt();
        Random ran = new Random();
//       int n = ran.nextInt(50);
  Produkt [] Fabryka = new Produkt[5];

        for (int i = 0; i < Fabryka.length; i++) {
            Fabryka[i] = null;
            Fabryka[i] = new Produkt(ran.nextInt(0, 999) , ran.nextDouble(500.0) );

        }

        Wyswietl(Fabryka);

       Minimum(Fabryka).getStan();

//         return metoda z najnizsza cene
//        informacja o produkcie ma byc cala zwracana w metodize najnizsza cena
    }



        private static void Wyswietl(Produkt[] p){
            for (int i = 0; i < p.length; i++) {
                System.out.println("Indeks: " + i + " " + "Cena "  + Math.round(p[i].getCena()*100+100)/(100.0) + " " + "Kod: " + p[i].getKod());
            }
        }

        private static Produkt Minimum (Produkt [] p){
        Produkt  min = p[0];
            for (int i = 0; i < p.length; i++) {
               if(p[i].getCena() < min.getCena()){
                   min = p[i];
               }

                }
                     return min;
                }

            }



