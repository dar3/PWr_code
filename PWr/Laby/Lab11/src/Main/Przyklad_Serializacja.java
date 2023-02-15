package Main;

import Frytki.Frytki;
import Frytki.SmazoneNaOlejuSlonecznikowym;
import Jedzenie.SerwisKucharza;
import Jedzenie.SerwisSzefaKuchni;
import Pizza.Pizza;
import Pizza.PizzaPieczonaWPiecuKamiennym;

import java.io.*;

public class Przyklad_Serializacja {

    private SerwisKucharza serwisKucharza = null;
    private SerwisSzefaKuchni serwisSzefaKuchni = null;

    private static SerwisSzefaKuchni odczytanySerwisSzefaKuchni = null;
    private static SerwisKucharza odczytanySerwisKucharza = null;

    public static void main(String[] args) {
        Przyklad_Serializacja przyklad_serializacja = new Przyklad_Serializacja();
        Pizza pizza = new PizzaPieczonaWPiecuKamiennym();
        Frytki frytki = new SmazoneNaOlejuSlonecznikowym();

        przyklad_serializacja.serwisKucharza = new SerwisKucharza();
        przyklad_serializacja.serwisKucharza.zamowienie(1, pizza, pizza.metodaPieczenia(), null, null);
        przyklad_serializacja.serwisSzefaKuchni = new SerwisSzefaKuchni();
        przyklad_serializacja.serwisSzefaKuchni.zamowienie(2, null, null, frytki, frytki.metodaSmazenia());

        System.out.println("serwisKucharza: " + przyklad_serializacja.serwisKucharza);
        System.out.println("serwisSzefaKuchni: " + przyklad_serializacja.serwisSzefaKuchni);
        System.out.println("odczytanySerwisKucharza: " + odczytanySerwisKucharza);
        System.out.println("odczytanySerwisSzefaKuchni: " + odczytanySerwisSzefaKuchni);
        System.out.println("Serialization...");
        przyklad_serializacja.zapisz();
        System.out.println("Deserialization...");
        przyklad_serializacja.odczytaj();

        System.out.println("odczytanySerwisKucharza: " + odczytanySerwisKucharza);
        System.out.println("odczytanySerwisSzefaKuchni: " + odczytanySerwisSzefaKuchni);

    }
    public void zapisz() {

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:\\Programming_projects\\java_projects\\PWR_code\\PWr\\Laby\\Lab11\\PlikKucharzy.ser")))
        {
            os.writeObject(serwisSzefaKuchni);
            os.writeObject(serwisKucharza);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void odczytaj() {

        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:\\Programming_projects\\java_projects\\PWR_code\\PWr\\Laby\\Lab11\\PlikKucharzy.ser"))) {

            Object obj1 = is.readObject();
            Object obj2 = is.readObject();

            odczytanySerwisSzefaKuchni = (SerwisSzefaKuchni) obj1;
            odczytanySerwisKucharza = (SerwisKucharza) obj2;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
