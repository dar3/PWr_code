package glowny;

import InterfejsGUI.Interfejs;
import MojWyjatek.mojwyjatek;
import Observable.ObservedClass;
import Observers.Observer1;
import Observers.Observer2;
import Observers.Observer3;
import Kontroler.*;

public class Main {

    public static void main(String[] args) {


        ObservedClass observedclass = new ObservedClass();
        Observer1 observer1 = new Observer1(observedclass);
        Observer2 observer2 = new Observer2(observedclass);
        Observer3 observer3 = new Observer3(observedclass);

        Interfejs interfejs = new Interfejs();
        Kontroler.przekaz(observedclass, interfejs);
        interfejs.StworzInterfejs();
    }
}
