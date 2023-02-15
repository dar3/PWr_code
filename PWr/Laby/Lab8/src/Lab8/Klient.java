package Lab8;

import java.util.Random;

public class Klient extends Osoba {

    private int n;
    private Lokata[] lokaty;

    public Klient() {
       lokaty = null;
       nazwisko = "";
       pesel = "";
       n = 0;


    }

    public Klient(String nazwisko, String pesel, int n) {
        super(nazwisko, pesel);
        this.n = n;

        lokaty = new Lokata[n];
        Wypelnij();
    }

    public void Wypelnij(){
        Random ran = new Random();
        for (int i = 0; i < lokaty.length; i++) {
            lokaty[i] = new Lokata(ran.nextInt(10000-500+1)+500, ran.nextDouble(10000.0-500.0+1)+500, ran.nextBoolean());

        }
    }


    @Override
    public double Oblicz() {
        double suma = 0;
        if(n==0){
            return 0;
        }
        for (int i = 0; i < lokaty.length; i++) {
            suma = suma + lokaty[i].getKwota();
        }
        return suma;
    }

    public String toString(){
        return "Klient: " +  nazwisko + "Pesel: " + pesel + " [n= " + n;
    }

    public void wyswietlLokaty(){
        if(this.lokaty != null){
            for(int i = 0; i < lokaty.length; i++) {
                System.out.println(lokaty[i]);

            }
        }

    }
}
