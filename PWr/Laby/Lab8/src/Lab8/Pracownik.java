package Lab8;
// class that is more specific extends class that is more general

import java.util.Random;

public class Pracownik extends Osoba {

//    String s - stanowisko
    private String s;
    private int pensja;
    private int stawka;
    private int[] t;

    public Pracownik() {
       s = "brak";
       nazwisko = "";
       pesel = "";
       pensja = 0;
       stawka = 0;
       t = null;
    }

    private void Wypelnienie(){
    t = new int[6];
    Random ran = new Random();
        for (int i = 0; i < t.length; i++) {
            t[i] = ran.nextInt(5);
        }

    }


    public Pracownik(String nazwisko, String pesel, String s, int pensja, int stawka) {
        super(nazwisko, pesel);
        this.s = s;
        this.pensja = pensja;
        this.stawka = stawka;
        Wypelnienie();
    }

    @Override
    public double Oblicz() {
            return pensja + stawka * wyswietlLiczbeNadgodzin();
    }

    @Override
    public String toString(){
        return "Pracownik: " + nazwisko + " " + " Pesel: " + pesel +" [Stanowisko= " + this.s + " pensja= "+  this.pensja + " stawka= " + this.stawka + "]";
    }

    public int wyswietlLiczbeNadgodzin(){
        int sum = 0;
    if(this.t == null){
    return 0;
}
        for (int i = 0; i < t.length; i++) {
            sum = sum + t[i];

        }
        System.out.println("Ilość nadgodzin: " + sum);
        return sum;
    }

    public boolean jestKasjerem(){
        if(s.equals("Kasjer")){
            return true;
        }

        else{

        return false;
        }

    }

}
