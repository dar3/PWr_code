package Kontroler;

import InterfejsGUI.Interfejs;
import MojWyjatek.mojwyjatek;
import Observable.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Kontroler {

    private static ObservedClass observedclass;
    private static String line;
    private static Interfejs interfejs;

    public static void przekaz(ObservedClass ob, Interfejs inter){

        observedclass = ob;
        interfejs = inter;

    }


    public static void odczytaj(String sciezka){

        File plik = new File(sciezka);

        try (BufferedReader breader = new BufferedReader(new FileReader(plik))) {

            while( (line = breader.readLine() ) != null )
            {
                    try {
                        observedclass.setMeasurements(line);
                    }
                    catch(mojwyjatek e){
                        e.printStackTrace();
                        interfejs.setStan();
                    }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
