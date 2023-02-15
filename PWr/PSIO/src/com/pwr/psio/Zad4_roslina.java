package com.pwr.psio;

public class Zad4_roslina {

    public static void main(String[] args) {
        Roslina roslina = new Roslina();
        roslina.Rosnij();
        roslina.Pokaz();
        roslina.RosnijDuzo(10);
        roslina.Pokaz();

        Zwierzak zwierzak = new Zwierzak();
        zwierzak.Zjedz(roslina, 5);
        roslina.Pokaz();
        zwierzak.Zjedz(roslina, 10);
        roslina.Pokaz();
    }
}
