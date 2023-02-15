package Observers;

import MojWyjatek.mojwyjatek;
import Observable.Subject;

public class Observer3 implements Observer {

    private String line;
    private Subject observedclass;

    public Observer3 (Subject observedclass){

        this.observedclass=observedclass;
        this.observedclass.registerObserver(this);
    }

    public void update(String line) throws mojwyjatek {
        this.line = line;

            display();

    }

    public void display() throws mojwyjatek{

        String[] tab = line.split(" ");

        for(int i=0; i<tab.length; i++){

            if(tab[i].equals("bomba") || tab[i].equals("zamach") || tab[i].equals("pistolet"))
                throw new mojwyjatek("Znaleziono niebezpieczne slowo");
        }
    }
}
